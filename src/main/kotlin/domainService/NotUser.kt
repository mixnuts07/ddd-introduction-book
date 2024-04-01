package domainService

data class NotUser(private val id: String, private val name: String) {
    fun exists(user: NotUser): Boolean {
        // 重複確認のふるまい
        return true
    }
}

val user = NotUser("kazu", "1").exists(user = NotUser("kazu", "2"))
