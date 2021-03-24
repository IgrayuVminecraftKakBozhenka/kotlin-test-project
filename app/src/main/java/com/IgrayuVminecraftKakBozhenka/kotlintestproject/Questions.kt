package com.IgrayuVminecraftKakBozhenka.kotlintestproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class Questions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question_variable)

        val firstAnswerButton = findViewById<RadioButton>(R.id.variantOne)
        val secondAnswerButton = findViewById<RadioButton>(R.id.variantTwo)
        val thirdAnswerButton = findViewById<RadioButton>(R.id.variantThree)
        val fourAnswerButton = findViewById<RadioButton>(R.id.variantFour)


        val firstQuestion = getString(R.string.first_question)
        val secondQuestion = getString(R.string.second_question)
        val testQuestions = arrayOf(Question(1, firstQuestion, "2011", 10), Question(2, secondQuestion, "JVM", 10))


        firstAnswerButton.setOnClickListener {
            answerArray[0] = 1
        }

        secondAnswerButton.setOnClickListener {
            answerArray[0] = 2
        }

        thirdAnswerButton.setOnClickListener {
            answerArray[0] = 3
        }

        fourAnswerButton.setOnClickListener {
            answerArray[0] = 4
        }


    }
}