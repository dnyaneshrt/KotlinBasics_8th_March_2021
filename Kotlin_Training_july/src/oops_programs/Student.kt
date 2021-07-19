package oops_programs

//originally object contains data
//class just describes the data
class FirstTest {
    fun display() {
        println("i am from FirstTest class")
    }
}

class Student {
    var name: String? = null
    var roll: Int = 0
    fun printDetails() {
        println("name =$name  roll=$roll")
    }
}

//no need to use new keyword to create object in kotlin.(in java Student s=new Student();)
fun main() {
    var f = FirstTest()
    f.display() // method calling

    var radhika = Student() //object creation in kotlin
    radhika.name = "radhika"
    radhika.roll = 10
    radhika.printDetails()//method  calling


    var nikhil = Student() //object creation in kotlin
    nikhil.name = "nikhil"
    nikhil.roll = 11
    nikhil.printDetails()

    var rupali = Student() //object creation in kotlin
    rupali.name = "rupali"
    rupali.roll = 12
    rupali.printDetails()

}