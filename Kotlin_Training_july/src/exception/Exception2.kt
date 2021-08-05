package exception
//throw is used to throw user defined or pre-defined exceptions


fun main() {
    println("please enter the age")
    var age= readLine()!!.toInt()

    if(age<0)
    {
        throw AgeCannotBeNegativeException()
    }
    if(age>18)
    {
        println("user can vote")
    }


}