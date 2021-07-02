package basic_programs

fun main() {
    println("variable Test");
    //type inference: on the basis of value it tell us which kind of data it is,it means type refernces
    var number = 10   //mutable-we can modify the value
    number = 100
//    number="rahul"  static-typed language
    println("value of number =$number")

    val marks = 90  //immutable -we cannot modify the value
    // marks=85  values cannot re-assingned
    println("value of marks $marks")


}