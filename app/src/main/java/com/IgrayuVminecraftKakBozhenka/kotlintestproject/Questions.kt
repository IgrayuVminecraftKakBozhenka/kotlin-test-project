package com.IgrayuVminecraftKakBozhenka.kotlintestproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class Questions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question_variable)

        var firstAnswerButton = findViewById<RadioButton>(R.id.variantOne)
        var secondAnswerButton = findViewById<RadioButton>(R.id.variantTwo)
        var thirdAnswerButton = findViewById<RadioButton>(R.id.variantThree)
        var fourAnswerButton = findViewById<RadioButton>(R.id.variantFour)


        val firstQuestion = getString(R.string.first_question)
        val secondQuestion = getString(R.string.second_question)
        val testQuestions = arrayOf(Question(1, firstQuestion, "2011", 10, getString(R.string.answer_two_first_question), getString(R.string.answer_four_first_question), getString(R.string.answer_three_first_question)),
                Question(2, secondQuestion, "JVM", 10, getString(R.string.incorrect_answer_one_second_question), getString(R.string.incorrect_answer_two_second_question), getString(R.string.incorrect_answer_three_second_question)))

        var question = findViewById<TextView>(R.id.question)

        question.setText(testQuestions[1].question)




    }
}