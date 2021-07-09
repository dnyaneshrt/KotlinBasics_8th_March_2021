package forloop

fun main() {

    println("enter no. of rows of columns")
    var rows = readLine()!!.toInt()

    for (i in 1..rows) {
        for (j in 1..i)
        {
            print(" #")
        }
        for(j in rows downTo i)
        {
            print(" *")
        }
        println("")

    }


}