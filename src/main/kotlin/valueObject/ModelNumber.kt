package valueObject

import java.lang.Error

data class ModelNumber(private val productCode: String, private val branch: String, private val lot: String) {
    init {
        if(productCode.isEmpty() || productCode.isBlank()) {
            throw Error("productCode is null")
        }
        if(branch.isEmpty()) {
            throw Error("branch is null")
        }
        if(lot.isEmpty()) {
            throw Error("lot is null")
        }
    }
    override fun toString(): String {
        return "$productCode-$branch-$lot"
    }
}