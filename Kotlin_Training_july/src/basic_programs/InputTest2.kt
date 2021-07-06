package basic_programs

fun main() {
    var count = 1
    var char: String
    while (true) {
        println("${count++} please enter student details")

        println("enter your roll number")
        var roll = readLine()!!.toInt()  //to get int as input

        println("enter your name")
        var name = readLine()!!

        println("enter your percentage here")
        var percent = readLine()!!.toFloat()

        println("enter the date of birth")
        var date = readLine()!!.toByte()

        println("please enter  result")
        var result = readLine()!!.toBoolean()

        println("student details are:\n")
        println("$roll $name $percent $result $date")

        while (true) {
            println("do you want to continue  y/n?")
            char = readLine()!!//y Y n N
            if (char.equals("y") || char.equals("Y")) {
                break

            } else if (char.equals("n") || char.equals("N")) {
                break
            } else {
                println("please enter only y or n")
                continue
            }
        }
        if (char.equals("y") || char.equals("Y")) {
            continue
        } else if (char.equals("n") || char.equals("N")) {
            break
        }
    }
    println("thanks")
}