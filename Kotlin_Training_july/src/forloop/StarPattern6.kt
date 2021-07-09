package forloop

fun main() {
    println("enter no. of rows of columns")
    var rows = readLine()!!.toInt()

    for (i in rows downTo 1) {

        for (j in 1..i) {
            print("  ")
        }
        for (col in rows downTo i) {
            print("   *")
        }
        println("")
    }

}