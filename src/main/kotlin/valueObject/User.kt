package valueObject

data class User(private val userId: UserId, private val userName: UserName) {
    fun createUser(): User {
        return User(userId, userName)
    }
}

data class UserId(private val value: String?) {
    init {
        if(value.isNullOrEmpty()) {
            throw Error("value is null or blank")
        }
    }
}

data class UserName(private val value: String?) {
    init {
        if (value.isNullOrEmpty()) {
            throw Error("value is null or empty")
        }
    }
}