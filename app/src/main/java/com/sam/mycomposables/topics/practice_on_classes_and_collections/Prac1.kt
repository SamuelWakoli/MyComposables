package com.sam.mycomposables.topics.practice_on_classes_and_collections

fun main() {

    val firstEvent = Event(
        title = "Study Kotlin",
        description = "Commit to studying Kotlin at least 8 hrs per day.",
        daypart = DayPart.Evening,
        durationInMinutes = 15,
    )

    println(firstEvent)
    println()
    println(firstEvent.daypart.getDaypartString())


    val myEvents = mutableListOf(
        Event(
            title = "Wake up",
            description = "Time to get up",
            daypart = DayPart.Morning,
            durationInMinutes = 0
        ),
        Event(title = "Eat breakfast", daypart = DayPart.Morning, durationInMinutes = 15),
        Event(title = "Learn about Kotlin", daypart = DayPart.Afternoon, durationInMinutes = 30),
        Event(title = "Practice Compose", daypart = DayPart.Afternoon, durationInMinutes = 60),
        Event(
            title = "Watch latest DevBytes video",
            daypart = DayPart.Afternoon,
            durationInMinutes = 10
        ),
        Event(
            title = "Check out latest Android Jetpack library",
            daypart = DayPart.Evening,
            durationInMinutes = 45
        ),

        )


    // determine : A "short" event is an event that is less than 60 minutes.

    println("\nShort events: ")
    val shortEvents = myEvents.groupBy { it.durationInMinutes < 60 }
    println("Short events Keys: ${shortEvents.keys}")

    shortEvents[true]?.forEach {
        println("Title: ${it.title} Duration: ${it.durationInMinutes} minutes")
    }

    // morning events
    val groupedMorningEvents = myEvents.groupBy { it.daypart.getDaypartString() == "morning" }
    println("\nMorning events keys: ${groupedMorningEvents.keys}")
    val morningEventsSize = groupedMorningEvents[true]?.size
    println("Morning: $morningEventsSize events.")

    // afternoon events
    val groupedAfternoonEvents = myEvents.groupBy { it.daypart.getDaypartString() == "afternoon" }
    println("Afternoon: ${groupedAfternoonEvents[true]?.size} events.")
    // evening events
    val groupedEveningEvents = myEvents.groupBy { it.daypart.getDaypartString() == "evening" }
    println("Evening: ${groupedEveningEvents[true]?.size} events.")
    // last event's title
    println("Last event of the day: ${myEvents.last().title}")

    // extending the data class
//    val Event.durationOfEvent: String
//    get() = if (this.durationInMinutes < 60) {
//        "short"
//    } else {
//        "long"
//    }

}

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: DayPart,
    val durationInMinutes: Int,
)

enum class DayPart {
    Morning, Afternoon, Evening;

    fun getDaypartString(): String {
        return when (this) {
            Morning -> "morning"
            Afternoon -> "afternoon"
            Evening -> "evening"
        }
    }
}
