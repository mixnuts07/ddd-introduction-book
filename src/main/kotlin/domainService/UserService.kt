package domainService

class UserService {
    fun exists(user: User): Boolean {
        return true
    }
}

val userService = UserService().exists(User("kazu", "1"))
