package com.sam.mycomposables.topics.practice_on_classes_and_collections

//Task 1

/*
Another software engineer already completed some high-level work for the app and you are tasked with implementing the details.

You need to implement the Event class. This class is used to hold the details of the event entered by the user. (Hint: This class does not need to define any methods or perform any actions.)

For this task you need to create a data class named Event.

An instance of this class should be able to store the:

Event title as a string.
Event description as a string (can be null).
Event day part as a string. We only need to track if the event starts in the morning, afternoon, or evening.
Event duration in minutes as an integer.
Before continuing, try writing the code for yourself.

Using your code, create an instance using the following information:

Title: Study Kotlin
Description: Commit to studying Kotlin at least 15 minutes per day.
Day-part: Evening
Duration: 15
Try printing your object to verify that you get the following output:


Event(title=Study Kotlin, description=Commit to studying Kotlin at least 15 minutes per day., daypart=Evening, durationInMinutes=15)
Once you complete the task, or give it your best attempt, click Next to see how we coded it.
 */

fun main() {

    val firstEvent = Event(
        title = "Study Kotlin",
        description = "Commit to studying Kotlin at least 15 minutes per day .",
        daypart = "Evening",
        durationInMinutes = 15,
    )

    println(firstEvent)
}

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: String,
    val durationInMinutes: Int,
)
