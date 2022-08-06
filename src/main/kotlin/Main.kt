/* In this array the 0th index will contain question,
the 1st index contains correct ans and rest all (2,3,4) will contain wrong answers*/

fun main(){
    val questions =
        arrayOf( "where was the buddha born",
                "which company does Facebook belongs to",
                "Which is the most used greeting word")

    val correctAnswers = arrayOf("Nepal","Meta","Hello")
    val wrongAnswer = arrayOf("India","Google","Namaste")
    val quiz = arrayOf(questions,correctAnswers,wrongAnswer)
var i =0;
    quiz.forEach{ hi ->
        questions[i].also(::println)
        correctAnswers[i].also(::println)
        wrongAnswer[i].also(::println)
        println("======================================")
        i++
    }
}
