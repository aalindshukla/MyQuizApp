package com.shuklaaalind.myquizapp

data class Question(
    val id: Int,
    val question: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer:  Int
)
/* This File is a model of a question...it is lime a class of questions and is called through the
object (Constants.kt) in which all the questions are framed.
 */