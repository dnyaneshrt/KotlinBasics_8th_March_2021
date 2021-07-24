package inheritance
/*
upcasting : holding child class object into parent class ref.
-if any method or conctructor is expecting Parent class ref.
 in that case you can pass Child class object as well because of upasting.
 */
fun main() {
//    var circle:Shape= Circle(5.0)
//    var triangle:Shape=Triangle(10.0,5.0)

//    calculateArea(circle)
//    calculateArea(triangle)
//    calculateArea(Square(5.0))

    var shapes= arrayOf(Circle(5.0),Circle(10.5),Triangle(5.0,5.0),
        Square(10.0),Square(50.0),Rectangle(25.0,5.0))
    calculateArea(shapes)

}

fun calculateArea(shapes:Array<Shape>)
{
    for(shape in shapes)
    {
        println("area of ${shape.toString()} = ${shape.area()}")
    }
}
//Shape shape=new Circle()   correct
//Shape shape=new Trainle()  correct


//fun calculateArea(shape:Shape)
//{
//    println("area of ${shape.toString()} = ${shape.area()}")
//}


open class Shape
{
    //Double in neccsessary
  open  fun area():Double
    {
        return 0.0
    }


}

class Circle(val radious:Double):Shape()
{
    override fun area(): Double {
      return Math.PI*radious*radious
    }
    override fun toString(): String {
        return "circle"
    }
}
class Triangle(val base:Double,val height:Double):Shape()
{
    override fun area(): Double {
        return 0.5*base*height
    }
    override fun toString(): String {
        return "traingle"
    }
}


class Square(val sides:Double):Shape()
{
    override fun area(): Double {
        return sides*sides
    }
    override fun toString(): String {
        return "square"
    }

}


class Rectangle(val side1:Double,val side2:Double):Shape()
{
    override fun area(): Double {
        return side1*side2
    }
    override fun toString(): String {
        return "rectangle"
    }

}
