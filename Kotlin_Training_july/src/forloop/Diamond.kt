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
    for (i in 1..rows) {
        for (j in 1..i+1) {
            print("  ")
        }
        for (j in rows downTo i+1) {
            print("   *")
        }
        println("")
    }

}