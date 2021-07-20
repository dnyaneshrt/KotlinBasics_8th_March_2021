package oops_programs

//The init block is always called after the primary constructor
//A class file can have one or more init blocks executing in sequence i.e. one after another.
fun main() {
    println("enter first number")
    var a= readLine()!!.toInt()
    println("enter second number")
    var b= readLine()!!.toInt()
   InitBlockTest(a,b)
}
class InitBlockTest(num1:Int,num2:Int) {

    init {

     if(num1>num2)
     {
         println("$num1 is greater")
     }else
     {
         println("$num2 is greater")
     }
    }
    init {
        println("this is my second init block")
    }
    init {
        println("this is my third init block")
    }
}