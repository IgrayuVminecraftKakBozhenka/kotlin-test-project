package com.IgrayuVminecraftKakBozhenka.kotlintestproject

class Question(
        val id: Int,
        val question: String,
        val answer: String,
        val reward: Int
) {
    fun checkAnswer(_answer: String): Boolean {
        return answer == _answer
    }
}