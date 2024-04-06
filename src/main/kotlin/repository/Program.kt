package repository

import domainService.Program
import domainService.User
import domainService.UserName
import domainService.UserService

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
}

class UserRepository: IUserRepository {
    override fun save(user: User) {
        TODO("Not yet implemented")
    }
    override fun find(userName: UserName): User {
        TODO("Not yet implemented")
    }
}