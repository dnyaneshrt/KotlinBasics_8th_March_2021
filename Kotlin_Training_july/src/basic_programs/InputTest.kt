package basic_programs

fun main() {
    println("enter first number")
    var num1 = readLine()!!.toInt()

    println("enter second number")
    var num2 = readLine()!!.toInt()

    var result = add1(num1, num2)
    println("$result")
}

fun add1(a: Int, b: Int): Int =a+b