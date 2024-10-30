package Unit1

class ImplementsBasicMath {
    fun main() {
        val firstNumber = 10
        val secondNumber = 5
        val thirdNumber = 8

        val result = add(firstNumber, secondNumber)
        val anotherResult = add(firstNumber, thirdNumber)
        val resultS1 = subtract(firstNumber, secondNumber)
        val resultS2 = subtract(firstNumber, thirdNumber)

        println("$firstNumber + $secondNumber = $result")
        println("$firstNumber + $thirdNumber = $anotherResult")
        println("$firstNumber - $secondNumber = $resultS1")
        println("$firstNumber - $thirdNumber = $resultS2")
    }

    fun add(firstNum: Int, secondNum: Int): Int {
        return firstNum + secondNum
    }

    fun subtract(firstNum: Int, secondNum: Int): Int {
        return firstNum - secondNum
    }
}