package valueObject

import java.lang.Error

data class FullName(private val firstName: String, private val lastName: String) {
    init{
        if (firstName.isEmpty()) {
            throw Error("firstName is empty")
        }
    }
}