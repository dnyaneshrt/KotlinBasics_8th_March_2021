package inheritance

fun main() {
    var c = C()
    c.infoA()
    c.infoB()
    c.infoC()
}

open class A {
    fun infoA() {
        println("i am from A class")
    }

}

open class B : A() {
    fun infoB() {
        println("i am from b class")
    }
}

class C : B() {
    fun infoC() {
        println("i am from c class")
    }

}