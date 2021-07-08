package forloop

fun main() {
    //i=1   true  5 times
    //i=2
    //1=3

    //i=1 ,2         j=1
    for (i in 1..5) {

        for (j in 1..i) {

//            print(" $i")
            print(" $j")

        }
        println("")

    }
}