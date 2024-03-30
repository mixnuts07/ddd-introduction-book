import valueObject.FullName
import valueObject.Main

fun main() {
    Main()
    val kazu = FullName("Kazutake", "Yamamoto")
    val kazu2 = FullName("Kazutake", "Yamamoto")
    println(kazu == kazu2) // true
}

