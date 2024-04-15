package applicationService

class UserUpdateCommand(val id: String? = null, val name: String? = null) {

}

class UserApplicationService(private val userRepository: IUserRepository, private val userService: UserService) {
    fun register(name: String) {
        val user = User(UserId("111"), UserName(name))
        if (userService.exists(user)) {
            throw Error("user exists...")
        }
        userRepository.save(user)
    }
    fun get(userId: String): UserData {
        val targetId = UserId(userId)
        val user =  userRepository.find(targetId)
        return UserData(user!!)
    }
    fun update(command: UserUpdateCommand) {
        val targetId = UserId(command.id)
        val user = userRepository.find(targetId)
        if(user === null) {
            throw Error("user is null")
        }
        val name = command.name
        val newUserName = name?.let { UserName(it) }
    }
    fun delete(command: UserUpdateCommand) {
        val targetId = UserId(command.id)
        val user = userRepository.find(targetId)
        user?.let { userRepository.delete(it) } ?: throw Error("not found $targetId")
    }
}

data class UserData(private val source: User) {
    init {
        val id = source.id
        val name = source.name
    }
}
interface IUserRepository {
    fun find(id: UserId): User?
    fun find(name: UserName): User
    fun save(user: User)
    fun delete(user: User)
}
class UserService {
    fun exists(user: User): Boolean {
        TODO()
    }
}

data class User(val id: UserId,val name: UserName) {
}

data class UserName(val value: String?) {
    init {
        if(value.isNullOrEmpty()) {
            throw Error("null")
        }
        if(value.length < 3) {
            throw Error("under length 3")
        }
    }
}

data class UserId(val value: String?) {
    init {
        if(value.isNullOrEmpty()) {
            throw Error("null")
        }
    }
}
