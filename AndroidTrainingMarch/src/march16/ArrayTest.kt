package march16

import java.util.Scanner
fun main() {

    //String array
    var names = arrayOf("sumeet", "swati", "vallabh", "amruta")
    var count = 1
    for (name in names) {
        println("${count++}  $name")
    }

    //Int array
    var marks = intArrayOf(10, 2, 5, 0, 50, 4, 14, 1,35)
    marks[5] = 5555
  println("${  marks.get(8)}")
    for (mark in marks) {
        println(mark)
    }

    //IntArray
    var intArray = IntArray(10)
    intArray.set(5, 9999)
    for (values in intArray) {
        println(values)
    }

    //used Sccaner from util.
    var sc = Scanner(System.`in`)//get the input values from user.

    println("enter your marks for 4 students:")
    var marksDynamic = IntArray(4)

//    println("enter the marks ")
//    var mark1=sc.nextInt()
//    println("entered marks are: $mark1")

    /*
    for(int i=0;i<arraynem.length;i++)
    {
    arrayname[i]=sc.nextInt();
    }
    for(int i=0;i<arrayname.length;i++)
    {
    System.out.println(arrayname[i])
    }
     */

    for (mark in 0 until marksDynamic.size) {
        marksDynamic[mark] = sc.nextInt()
    }

    count = 1
    for (marks in marksDynamic) {
        println("marks for ${count++}  =$marks")
    }
}
