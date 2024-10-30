package com.example.myapplication

class Task1 {
    data class Event(
        val title: String,
        val description: String? = null,
        val daypart: String,
        val durationInMinutes: Int,
    )

    fun main() {
        var event_instance = Event(
            title = "Study Kotlin",
            description = "Commit to studying Kotlin at least 15 minutes per day.",
            daypart = "Evening",
            durationInMinutes = 15
        )

        print(event_instance)
    }
}