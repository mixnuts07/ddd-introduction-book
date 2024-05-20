package repository

import domainService.*
import domainService.Program

data class Program(private val userRepository: IUserRepository) {
    fun createUser(userName: UserName) {
        val user = User(userName)
        val userService = UserService()
        if(userService.exists(user)) throw Error("exists user...")
        userRepository.save(user)
    }
}

val userName = UserName("Yamamoto")
val program = Program(UserRepository()).createUser(userName)
interface IUserRepository {
    fun save(user: User)
    fun find(userName: UserName): User
    fun nextIdentity(): UserId
}

class UserRepository: IUserRepository {
    override fun save(user: User) {
        TODO("Not yet implemented")
    }
    override fun find(userName: UserName): User {
        TODO("Not yet implemented")
    }
    override fun nextIdentity(): UserId {
        TODO("Not yet implemented")
    }
}