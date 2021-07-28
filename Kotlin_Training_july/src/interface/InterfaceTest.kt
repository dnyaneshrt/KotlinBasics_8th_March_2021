package `interface`

interface Draggeble {
    fun drag()
}

fun main() {

    dragObjects(arrayOf(Circle(5.0), Triangle(5.0, 10.0), Square(25.0), User()))
}

fun dragObjects(dragObjects: Array<Draggeble>) {
    for (drag in dragObjects) {
        drag.drag()
    }

}

abstract class Shape : Draggeble {
    abstract fun area(): Double   //abstract method


}

//multiple interface
class Circle(val radious: Double) : Shape(), Draggeble {
    override fun area(): Double {
        return Math.PI * radious * radious
    }

    override fun drag() {
        println("Circle is dragging")
    }

}

class Triangle(val base: Double, val height: Double) : Shape(), Draggeble {
    override fun area(): Double {
        return 0.5 * base * height
    }

    override fun drag() {
        println("Traingle is dragging")
    }

}

class Square(val sides: Double) : Shape(), Draggeble {
    override fun area(): Double {
        return sides * sides
    }

    override fun drag() {
        println("Square is dragging")
    }


}

class User : Draggeble {
    override fun drag() {
        println("i am user")
    }

}