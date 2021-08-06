package exception

fun main() {
//    var name: String? = null
//    println(name?.length)
//    println(name!!.length)

    println("enter first number")
    var num1= readLine()!!.toInt()

    println("enter second number")
    var num2= readLine()!!.toInt()

    println("addition of $num1 and $num2 is ${num1+num2}")


}