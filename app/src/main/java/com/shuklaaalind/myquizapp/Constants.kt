package com.shuklaaalind.myquizapp

import java.util.*

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,"What Country does this flag belong to ?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","Australia",
            "Armenia","None of these",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            1,"What Country does this flag belong to ?",
            R.drawable.ic_flag_of_fiji,
            "Germany","Australia",
            "Armenia","Fiji",
            4
        )
        questionsList.add(que2)

        val que3 = Question(
            1,"What Country does this flag belong to ?",
            R.drawable.ic_flag_of_brazil,
            "Brazil","Australia",
            "Armenia","Denmark",
            1
        )
        questionsList.add(que3)

        val que4 = Question(
            1,"What Country does this flag belong to ?",
            R.drawable.ic_flag_of_india,
            "Argentina","Australia",
            "India","Austria",
            3
        )
        questionsList.add(que4)

        val que5 = Question(
            1,"What Country does this flag belong to ?",
            R.drawable.ic_flag_of_australia,
            "New zealand","Australia",
            "Nepal","Austria",
            2
        )
        questionsList.add(que5)

        val que6 = Question(
            1,"What Country does this flag belong to ?",
            R.drawable.ic_flag_of_new_zealand,
            "India","New zealand",
            "Germany","Denmark",
            2
        )
        questionsList.add(que6)

        val que7 = Question(
            1,"What Country does this flag belong to ?",
            R.drawable.ic_flag_of_kuwait,
            "Sri lanka","Iraq",
            "Iran","Kuwait",
            4
        )
        questionsList.add(que7)

        val que8 = Question(
            1,"What Country does this flag belong to ?",
            R.drawable.ic_flag_of_denmark,
            "Denmark","Iran",
            "England","USA",
            1
        )
        questionsList.add(que8)

        val que9 = Question(
            1,"What Country does this flag belong to ?",
            R.drawable.ic_flag_of_belgium,
            "Nepal","Iraq",
            "Belgium","India",
            3
        )
        questionsList.add(que9)
        return questionsList
    }

}