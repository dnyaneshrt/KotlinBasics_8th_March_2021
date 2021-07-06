package basic_programs

//ranges operater in kotlin   1..20
fun main() {
    println("enter any number")
    var age = readLine()!!.toInt()

    when (age) {
        in 1..17 -> println("user cannot vote,please go and play")
        in 18..80 -> println("user can vote")
        else-> println("go home,take rest")
    }
}