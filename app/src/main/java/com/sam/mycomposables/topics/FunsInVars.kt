package com.sam.mycomposables.topics

// fundamental in Higher order functions

fun main() {
    val coins: (Int) -> String = {
            size -> "$size toppings"
    }

    trickOrTreat(true, null)
    trickOrTreat(false, extraTreat = coins)

    // trickOrTreat is a higher order fun

    trickOrTreat(false) {
        "$it extra treats"
    }

}

fun trickOrTreat (isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit{
    return if (isTrick) {
        trick
    } else {
        if (extraTreat != null) {
            println(extraTreat(2))
        }
        treat
    }
}

val trick: () -> Unit = {
    println("No treat!")
}

val treat: () -> Unit = {
    println("You have treats!")
}