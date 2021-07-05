package basic_programs

//there in very less chance of getting NPE in kotlin
fun main(args: Array<String>) {
    var fname = ""
    var lname = ""
    println("enter your first name:")
    fname= readLine()!!  // to get the input from user

    println("enter your last name:")
    lname= readLine()!!  // to get the input from user

    getName(fname,lname)
    getFirstName(fname)
}
//inline function
fun getFirstName(fname: String) =println("my name is $fname")

fun getName(first_name: String, last_name: String): Unit {

    println(" from getname function")
    println("$first_name $last_name")
}


