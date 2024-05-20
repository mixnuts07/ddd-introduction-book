package valueObject

data class Circle(val userId: String, val circleName: String) {
    fun createCircle(): Circle {
        return Circle(this.userId, this.circleName)
    }
}