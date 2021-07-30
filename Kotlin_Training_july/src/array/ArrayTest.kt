package array

//array is collection of similler type of data elements.
//array has fixed size
//array index always starts with zero
//array always stores in contiguous memory location

fun main() {
    var i = 1
//    var roll_numbers=arrayOf(11,12,13,14,15,16,17)  //implicit array declaration
    var roll_numbers = arrayOf<Int>(11, 12, 13, 14, 15, 16, 17) //explicit array declaration
    var names:Array<String> = arrayOf<String>("rahul", "varshali", "komal", "nikhil", "shradha", "radhika", "rupali")
    var names1 = arrayOf<String>("rahul", "varshali", "komal", "nikhil", "shradha", "radhika", "rupali")

    i = 1
    for (name in names) {
        println("${i++} $name")
    }
    println("number of array elements =${names.size}")
    println("the 4th array element is =${names.get(3)}")
    println("the 4th array element is =${names[3]}")
    names.set(3, "nikhil patil")
    i = 1
    for (name in names) {
        println("${i++} $name")
    }

    var nams = names.iterator()
    names.forEach {
        println("name = ${it} =${it.length}")
    }
    println("${names.get(3).substring(3, 8)}")// nikhil patil "hil p"
    println(names.equals(roll_numbers))
    println(names.equals(names1))
    println(names.equals(names))
//    names.reverse()
//    println("my array in reverse order");
//    i=1
//    for (name in names) {
//        println("${i++} $name")
//    }

    println("my array in reverse order wihtout using revers() method is :")

    for (name in names.size - 1 downTo 0) {
        println("$name = ${names.get(name)}")
    }
}
