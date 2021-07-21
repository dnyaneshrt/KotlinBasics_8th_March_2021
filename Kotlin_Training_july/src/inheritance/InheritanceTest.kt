package inheritance

//single level inheritance
fun main() {
    var c=InheritanceTest()//child class object
    println(c.property)
    println(c.money)
    c.test("nikhil",87.54,1)
}
//Parent class
open class Parent {
    var property = "car"

    fun test(name:String,marks:Double,roll:Int)
    {
        println("roll number = $roll")
        println("name of student =$name \nmarks of student= $marks ")
    }

}

//Child class
class InheritanceTest:Parent() {
    var money = 5000
}