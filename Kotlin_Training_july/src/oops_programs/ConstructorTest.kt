package oops_programs

/*
Types of constrctors:
1)primary constructor
2)secondry constrctor.

-we can have only one primary constructor for a class.
-we can have any number of secondry cons.
-for single class you can have either primary constructor or secondry constrctors.but if you have
both constrctors together we have to call primary  from sec constrctor with the help of this().
*/
//we can overload constructor in kotlin as well
fun main() {
    println("enter any number")
    var num = readLine()!!.toInt()

    var obj=ConstructorTest(num)
    obj.displayNumber()
}

//primary constructor
class ConstructorTest(var num1: Int) {

fun displayNumber()
{
    println("entered number = $num1")
}

}