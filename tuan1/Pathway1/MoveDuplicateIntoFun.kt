package Unit1

class MoveDuplicateIntoFun {
    fun main() {
        printWeather("Ankara", 27, 31, 82)
        printWeather("Tokyo", 32, 36, 10)
        printWeather("Cape Town", 59, 64, 2)
        printWeather("Guatemala City", 50, 55, 7)
    }

    fun printWeather(city: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
        println("City: $city")
        println("Low temperature: $lowTemp, High temperature: $highTemp")
        println("Chance of rain: $chanceOfRain%")
        println()
    }

}