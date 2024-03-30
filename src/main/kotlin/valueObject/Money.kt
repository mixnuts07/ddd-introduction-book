package valueObject

import java.lang.Error
import java.text.DecimalFormat
import java.util.Currency

data class Money(private val amount: Int, private val currency: Currency) {
    fun add(): Money {
        return Money(amount + amount, currency)
    }
}