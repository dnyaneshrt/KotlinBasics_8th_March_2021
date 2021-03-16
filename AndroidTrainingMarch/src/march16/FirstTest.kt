package march16

fun main() {
    var obj = Child()
    obj.parentInfo()
}

open class Parent {
    open var id = 105
    open var name = "parent"
    open fun parentInfo() {
        println("the value id is ${id}")
        println("the name is ${name}")
    }
}
//1  replace extends with :
// 2 add  constrctor invocation to parent class
// 3 your parent class must be open

//4 if u want to override the method in kotlin the parent class method must be open,and for the the child class method we have to metion(with the help of override keyword) that we are overridung that method
class Child : Parent() {
    override var id = 5
    override var name = "child"
    override fun parentInfo() {
        println("the value id is ${super.id}")
        println("the name is ${name}")
    }
}