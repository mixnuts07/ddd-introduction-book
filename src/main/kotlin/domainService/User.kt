package domainService

class Program {
    fun createUser(userName: String) {
        UserName(userName)

    }
}

interface UserService {
    fun exists(user: User): Boolean
}

data class User(private val name: UserName?) {
    init {
        if(name === null) {
            throw Error("null or empty")
        }
    }
}

data class UserId(private val value: String?) {
    init {
        if(value.isNullOrEmpty()) {
            throw Error("null")
        }
    }
}

data class UserName(private val value: String?) {
    init {
        if(value.isNullOrEmpty()) {
            throw Error("null")
        }
        if(value.length < 3) {
            throw Error("under length 3")
        }
    }
}