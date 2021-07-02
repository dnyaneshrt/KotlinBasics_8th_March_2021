package basic_programs

//unit means void
//inline function- function having only one statement
fun test(): Unit = println("i am from test function")

fun add(num1: Int, num2: Int): Int = num1 + num2

fun main() {
    test()  //function calling
    var result: Int
    result = add(10, 40)  //function calling by pasing an arguments
    println("result after calling that method= $result")
}