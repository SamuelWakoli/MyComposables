package com.sam.mycomposables.topics

fun main() {
    println(numbersArrayInt[0]) // print the first index in the array
    println(numbersArrayInt.average()) // gets the average


    val numbers = arrayOf(1, 2, 3, 4, 5)
    val newNumbers = Array(numbers.size + 1) { 33 }
    for (i in numbers.indices) {
        newNumbers[i] = numbers[i]
    }
//    newNumbers[numbers.size] = 6

    println("numbers.toList(): ${numbers.toList()}")
    println("newNumbers ${ newNumbers.toList() }")

    println("Size of the planets is: ${planets.size}")
}

//array
/**
An array is a data structure that allows you to store a collection of data items of the same type.
The data items in an array are arranged in contiguous memory locations, which means that they are
stored next to each other in memory. This makes it very efficient to access the data items in an array,
because you can access them by their index.
 */

val numbersArrayInt = arrayOf<Int>(1, 2, 3, 4, 5)


// list
/**
List is an interface that defines properties and methods related to a read-only ordered collection of items.
MutableList extends the List interface by defining methods to modify a list, such as adding and removing elements.
 */

val planets = mutableListOf<String>(
    "Mercury",
    "Venus",
    "Earth",
    "Mars",
    "Jupyter",
    "Saturn",
    "Uranus",
    "Neptune",
    "Pluto"
)