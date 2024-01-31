package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERs : String = "correct_answers"


    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "argentina","australia",
            "austria","armenia",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            2,"What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "canada","australia",
            "south africa","belgium",
            4
        )
        questionList.add(que2)

        val que3 = Question(
            3,"What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "india","australia",
            "austria","newzeland",
            2
        )
        questionList.add(que3)

        val que4 = Question(
            4,"What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "argentina","australia",
            "brazil","zamica",
            3
        )
        questionList.add(que4)

        val que5 = Question(
            5,"What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "denmark","greece",
            "pakistan","armenia",
            1
        )
        questionList.add(que5)

        val que6 = Question(
            6,"What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "argentina","kyena",
            "figi","morocco",
            3
        )
        questionList.add(que6)

        val que7 = Question(
            7,"What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "paris","germany",
            "england","armenia",
            2
        )
        questionList.add(que7)

        val que8 = Question(
            8,"What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "iraland","srilanka",
            "india","armenia",
            3
        )
        questionList.add(que8)

        val que9 = Question(
            9,"What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "sudiariabia","australia",
            "nepal","kuwait",
            4
        )
        questionList.add(que9)

        val que10 = Question(
            10,"What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "china","australia",
            "newzeland","sweden",
            3
        )
        questionList.add(que10)

        return questionList
    }
}