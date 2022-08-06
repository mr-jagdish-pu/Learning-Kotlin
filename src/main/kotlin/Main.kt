fun main() {

    val questions = mutableListOf(
        arrayOf("where was the buddha born", "Nepal", "India"),
        arrayOf("which company does Facebook belongs to", "Meta", "Google"),
        arrayOf("Which is the most used greeting word", "Hello", "Namaste")

    )
   lateinit var question:String
    lateinit var correctAns:String
    lateinit var wrongAns:String
  lateinit  var addQuestion:List<Array<String>>

    println("How many question you're adding ")
    val no = readln().toInt()
    for (i in 1..no) {
        println("Please Enter question")
        question = readln()
        println("Please Enter Correct Answer")
        correctAns = readln()
        println("Please Enter wrong answer")
        wrongAns = readln()
        addQuestion =  listOf(arrayOf(question,correctAns,wrongAns))

        questions += addQuestion
        println("Question added")
    }

questions.forEach { array ->
        array.forEach {
            println(it)

        }
println("_______________________________________________")
    }
}

