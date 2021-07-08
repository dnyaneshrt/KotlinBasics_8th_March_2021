package forloop

fun main() {
    var ch='A'
    for (i in 1..6) {

        for (j in 1..i) {

            print(" ${ch++}")
        }
        println("")

    }
}