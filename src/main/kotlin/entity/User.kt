package entity

import valueObject.UserId
import java.lang.Exception

data class User(private var name: String?, private val userId: UserId) {
    fun changeName(name: String?) {
        if (name.isNullOrEmpty()) {
            throw Error("name is null or empty")
        }
        if (name.length < 3) {
            throw Error("name length is under 3")
        }
        this.name = name
    }
}

data class UserId(private val value: String?) {
    init {
        if(value.isNullOrEmpty()) {
            throw IllegalArgumentException("value is bad")
        }
    }
}