package basic_programs

fun main() {
    println("please enter the day")
    var day= readLine()// to get the String type of input from  user

    when(day)
    {
        "monday"->println("today is monday")
        "Tuesday"->println("today is Tuesday")
        "wednesday"->println("today is wednesday")
        "thursday"->println("today is thursday")
        "friday"->println("today is friday")
        "saturday"->println("today is saturday")
        "sunday"->{
            println("today is sunday")
            println("today is holiday and this is my favourite day")
        }
        else->println("please enter valid day")
    }

}