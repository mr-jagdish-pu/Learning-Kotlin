

 open class User {
    lateinit var name: String


}
class Admin :User() {
     var canEditContent : Boolean =true
}
 object Ques  {
      var hi = 10
 }
 fun main(){
     val obj = Admin()
     Ques.hi = 12
     obj.canEditContent=false
    println(Ques.hi == 12)
     obj.name ="Jagdish Ghimire".plus(" is admin").also (::println)
    println (obj.name.replace("i","ee",true))
 }
