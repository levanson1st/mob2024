package Unit1

class CompareTwoNum {
    fun main() {
        val timeSpendToday = 300
        val timeSpendYesterday = 250
        println(compare(timeSpendToday, timeSpendYesterday))
    }

    fun compare(timeToday: Int, timeYesterday: Int): Boolean {
        return timeToday > timeYesterday
    }
}