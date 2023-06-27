package com.sam.mycomposables.topics

fun main() {
    //using forEach
    cookies.forEach {
        println(it.name)
    }

    // using forEach to store items in a new list
    val namesOfCookies = mutableListOf<String>()
    cookies.forEach {
        namesOfCookies.add(it.name)
    }

    println(namesOfCookies)

    // using map()

    val cookieShopMenu = cookies.map {
        "${it.name} - Ksh. ${it.price}"
    }

    cookieShopMenu.forEach {
        println(it)
    }


    // filter()
    /*
    The filter() function lets you create a subset of a collection.
    For example, if you had a list of numbers, you could use filter()
    to create a new list that only contains numbers divisible by 2.
     */

    val softBakedCookies = cookies.filter {
        it.softBaked
    }

    println("\nFiltered SoftBaked Cookies: ")
    softBakedCookies.forEach {
        println("${it.name} - ${it.price}")
    }


    // groupBY()
    /*
    The groupBy() function can be used to turn a list into a map,
    based on a function. Each unique return value of the function
    becomes a key in the resulting map. The values for each key are
    all the items in the collection that produced that unique return value.
     */

    // example: odd even numbers:
    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 100)
    val groupedNumbers = numbers.groupBy { it % 2 } // if the number is divisible by 2
    val groupedNumbersKeys = groupedNumbers.keys
    println(groupedNumbersKeys.toString())
    val evenNumbers = mutableListOf<Int>()
    groupedNumbers[0]?.forEach {
        evenNumbers.add(it)
    }

    print("even numbers")
    println(evenNumbers)

    val oddNumbers = mutableListOf<Int>()
    groupedNumbers[1]?.forEach {
        oddNumbers.add(it)
    }
    print("odd numbers: $oddNumbers")

    println()
    println("\nNow we return to cookies")
    val groupedMenu = cookies.groupBy { it.softBaked }

    val smoothCookies = groupedMenu[true]
    val crunchyCookies = groupedMenu[false]

    println("Smooth grouped Cookies:")
    smoothCookies?.forEach {
        println(it.name)
    }
    println("\nCrunchy grouped Cookies: ")
    crunchyCookies?.forEach {
        println(it.name)
    }


    // fold()
    /*
    The fold() function in Kotlin is a recursive function that accumulates
    a value starting with an initial value and applying an operation from
    left to right to the current accumulator value and each element. The
    operation takes two arguments: the current accumulator value and the
    element. The fold() function returns the accumulated value after
    processing all the elements in the collection.
     */

    println("\nfold()")
    val sum = numbers.fold(0) { acc, i -> acc + i }
    println(sum)
    // let's get total price of all cookies
    val priceList = mutableListOf<Double>()
    cookies.forEach {
        priceList.add(it.price)
    }
    val priceListSum = priceList.fold(0.0) { accumulation, indexValue ->
        accumulation + indexValue
    }
    println("Total sum of price list: $priceListSum")


    // reduce()
    /*
    Accumulates a value starting with the first element in the collection
    and applying an operation from left to right to the current accumulator
    value and each element.
     */
    println("\nreduce()")
    val sumByReduce = numbers.reduce { accumulation, indexValue -> accumulation + indexValue }
    println("Sum by reduce(): $sumByReduce")


    // sortedBy()
    println("\nsortedBy()")

    println("Sorted by name:")
    val sortedMenuByName = cookies.sortedBy { it.name }
    sortedMenuByName.forEach {
        println(it.name)
    }

    println("\nSorted by price")
    val sortedMenuByPrice = cookies.sortedBy { it.price }
    sortedMenuByPrice.forEach {
        println("${it.name} - ${it.price}")
    }

}

data class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double,
)

val cookies = listOf(
    Cookie(
        name = "Chocolate chip", softBaked = false, hasFilling = false, price = 1.69
    ), Cookie(
        name = "Banana Walnut", softBaked = true, hasFilling = false, price = 1.49
    ), Cookie(
        name = "Vanilla Creme", softBaked = false, hasFilling = true, price = 1.59
    ), Cookie(
        name = "Chocolate Peanut Butter", softBaked = false, hasFilling = true, price = 1.49
    ), Cookie(
        name = "Snicker doodle", softBaked = true, hasFilling = false, price = 1.39
    ), Cookie(
        name = "Blueberry Tart", softBaked = true, hasFilling = true, price = 1.79
    ), Cookie(
        name = "Sugar and Sprinkles", softBaked = false, hasFilling = false, price = 1.39
    )
)