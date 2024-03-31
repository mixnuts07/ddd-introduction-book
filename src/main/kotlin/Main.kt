import entity.User
import entity.UserId
import valueObject.FullName
import valueObject.Main
import valueObject.Money
import java.util.*

fun main() {
    Main()
    val kazu = FullName("Kazutake", "Yamamoto")
    val kazu2 = FullName("Kazutake", "Yamamoto")
//    val kazt3 = FullName("", "test") throw Error
    println(kazu == kazu2) // true
    println(Money(1000, Currency.getInstance(Locale.JAPAN)).add()) // Money(amount=2000, currency=JPY)

    val kazuEntity = User("kazu", UserId("1"))
    println(kazuEntity) // User(name=kazu)
    kazuEntity.changeName("kazutake")
    println(kazuEntity) // User(name=kazutake)
}

