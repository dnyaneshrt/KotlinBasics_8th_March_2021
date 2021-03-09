package march9

fun main() {
    //ranges in kotlin
    var num = 1..100
    var count = 1
//print values with diffenece of 5
//    for(x in num step 5)
//    {
//        println("  $x   -     ${count++}")
//    }
//    count=1;
//    //print values in reverse order
//    for(x in 100 downTo 1 step 2 )
//    {
//
//        println("  $x   -     ${count++}")
//    }

    //unitll means within last range value
//    for(x in 1 until 100)
//    {
//
//        println(x)
//    }

    for (i in 0..5) {
        for (j in 0..i) {
            print(" * ")
        }
        println("")
    }

    println("second star pattern")

    for (i in 5 downTo 1) {

        for (j in 1..i) {
            print(" * ")
        }
        println("")
    }

    println("enter any number")
    var number= readLine()!!.toInt()

    if(number in 1..18)
    {
        println("cannot drive")
    }else if(number !in 1..18)
    {
        println("u can drive")
    }
}