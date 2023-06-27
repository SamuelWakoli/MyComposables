package com.sam.mycomposables.topics

fun main() {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 =
        Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    println(question1.difficulty.getDifficulty())
}

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty,
)

enum class Difficulty {
    EASY,
    MEDIUM,
    HARD;

    fun getDifficulty(): String {
        return when (this) {
            EASY -> "easy"
            MEDIUM -> "medium"
            HARD -> "hard"
        }
    };
}

