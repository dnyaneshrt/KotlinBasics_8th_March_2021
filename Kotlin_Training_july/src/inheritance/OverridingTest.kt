package inheritance

fun main() {
    var s = SmartPhone()
    println("name of phone is = ${s.name}")
    println("size of phone= ${s.size}")
    s.makeCall()
    s.camera()
}

open class Phone {
    open var name: String = "phone"
    var size: Int = 5
    fun makeCall() {
        println("calling via normal phone")
    }

    //open keyword must be used if you want to override a method
    open fun camera() {
        println("2mp camera")
    }
}

class SmartPhone : Phone() {
    override var name: String = "OppoA9"

    //override keyword must be used if you want to override a method
    override fun camera() {
        super.camera() //it will execute camera method from super class
        println("32 mp camera")
        println("name of older phone using super keyword= ${super.name}")//name from super classs
    }

}

class OverridingTest {

}