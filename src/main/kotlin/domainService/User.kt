package domainService

data class User(private val id: String, private val name: String) {
    fun exists(user: User): Boolean {
        // 重複確認のふるまい
        return true
    }
}

val user = User("kazu", "1").exists(user = User("kazu", "2"))
