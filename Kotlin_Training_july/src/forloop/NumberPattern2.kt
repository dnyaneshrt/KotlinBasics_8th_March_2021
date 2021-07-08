package forloop

fun main() {
    var count=1
    for (i in 1..5) {

        for (j in 1..i) {

            print(" ${count++}")
        }
        println("")
    }
}