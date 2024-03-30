package valueObject

class Main {
    private val fullNameJa = "yamamoto kazutake"
    private val tokens = fullNameJa.split(" ")

    private val fullNameEUR = "John Smith"
    private val tokensEUR = fullNameEUR.split(" ")

    init {
        println(fullNameJa) // yamamoto kazutake
        println(tokens) // [yamamoto, kazutake]
        println(tokens[0]) // yamamoto
        println("----")
        println(fullNameEUR) // John Smith
        println(tokensEUR) // [John, Smith]
        println(tokensEUR[0]) // John
    }
}