package Unit1

class Pedometer {
    fun main() {
        val steps = 4000
        val caloriesBurned = PedometerStepsToCalories(steps);
        println("Walking $steps steps burns $caloriesBurned calories")
    }

    fun PedometerStepsToCalories(NumberOfSteps: Int): Double {
        val caloriesBurnedForEachStep = 0.04
        val totalCaloriesBurned = NumberOfSteps * caloriesBurnedForEachStep
        return totalCaloriesBurned
    }
}