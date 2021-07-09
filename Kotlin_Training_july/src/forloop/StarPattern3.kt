package forloop

fun main() {

    println("enter no. of rows of columns")
    var rows = readLine()!!.toInt()

    for (row in 1..rows - 1) {
        for (col in 1..row) {
            print(" *")
        }
        println("")
    }

    for (i in rows downTo 1) {

        for (j in 1..i) {
            print(" *")
        }
        println("")
    }


}