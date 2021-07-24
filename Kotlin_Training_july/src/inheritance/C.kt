package inheritance

fun main() {
    var c = C()
    c.infoA()
    c.infoB()
    c.infoC()
}

open class A {
    init {
        println("from constrctor A")
    }
    fun infoA() {
        println("i am from A class")
    }

}

open class B : A() {
    init {
        println("from constrctor B")
    }
    fun infoB() {
        println("i am from b class")
    }
}

class C : B() {
    init {
        println("from constrctor C")
    }
    fun infoC() {
        println("i am from c class")
    }

}