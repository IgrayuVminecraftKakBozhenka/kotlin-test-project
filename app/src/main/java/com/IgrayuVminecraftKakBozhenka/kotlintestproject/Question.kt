package com.IgrayuVminecraftKakBozhenka.kotlintestproject

class Question(
        val id: Int,
        val question: String,
        val answer: String,
        val reward: Int
        val incorrectAnswerOne: String,
        val incorrectAnswerTwo: String,
        val incorrectAnswerThree: String
) {
    fun checkAnswer(_answer: String): Boolean {
        return answer == _answer
    }
}