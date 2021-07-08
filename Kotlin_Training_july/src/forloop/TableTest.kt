package forloop

fun main() {
    println("Enter any number")
    var num= readLine()!!.toInt()

    //5*1=5
    //5*2=10
    for(x in 1..10)
    {
    println("$num * $x = ${num*x}")
    }

}