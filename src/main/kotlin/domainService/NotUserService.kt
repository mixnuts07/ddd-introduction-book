package domainService

class NotUserService {
    fun exists(user: NotUser): Boolean {
        return true
    }
}

val userService = NotUserService().exists(NotUser("kazu", "1"))
