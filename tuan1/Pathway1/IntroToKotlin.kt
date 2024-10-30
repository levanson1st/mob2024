package Unit1

class IntroToKotlin {
    fun main() {
        val count = 2 // val cannot change the intial value
        var newcount = 5
        newcount = 100 // var can change the intial value
        val count2: Int = 5
        val hello: String = "Hello, android"
        println(hello)
        println(count)
        println("Hello, $count android")
        println("You need to do ${count + count2} exercise")
        println("say \"hello\"") // say "hello"
        val someText = newFunction()
        println(someText)
        println(plus(count, count2))
    }

    fun newFunction(): String {
        val text: String = "This is the first text"
        val text1: String = "This is the second text"
        return "$text\n$text1"
    }
    fun plus(firstNum: Int, secondNum: Int): Int {
        return firstNum+secondNum
    }

}