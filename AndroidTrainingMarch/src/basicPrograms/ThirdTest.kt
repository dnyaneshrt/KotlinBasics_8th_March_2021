package basicPrograms

fun main()
{
    println("enter first number")
    var num1= readLine()!!.toInt()
    println("enter second number")
    var num2= readLine()!!.toInt()

    addition(num1,num2)
}

fun addition(i: Int, i1: Int) = println("addtion of two number is= ${i+i1}")