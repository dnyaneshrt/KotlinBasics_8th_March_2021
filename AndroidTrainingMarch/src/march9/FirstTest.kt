package march9

import java.util.*

fun main()
{
    var sc= Scanner(System.`in`)

    println("enter the day:")
    var day=sc.nextInt()


    /*
    when statement you can use as an expression as well
    -else statement must be at the last.
    -if you have more than one statement,put those statements inside opening and closing curly bracses.

     */

//  when(day)
//    {
//        1->println("monday")
//        2->println("tuesday")
//        3->println("Wednesday")
//        4->println("thurdsay")
//        5->println("friday")
//        6->{
//            println("saturday")
//            println("it's weekend .enjoy!!")
//        }
//
//        7->println("sunday")
//
//        else->println("please enter  valid date")
//
//    }



   var result= when(day)
    {
        1->"monday"
        2->"tuesday"
        3->"Wednesday"
        4->"thurdsay"
        5->"friday"
        6->{
            "saturday"
            "it's weekend .enjoy!!"
        }

        7->"sunday"

        else->"please enter  valid date"

    }

    println("selected day= $result")

}