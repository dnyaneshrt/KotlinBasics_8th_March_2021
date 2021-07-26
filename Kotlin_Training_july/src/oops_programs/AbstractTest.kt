package oops_programs

//abtsract keyword is used o crate abstract class. and abstract methods
//only abtsract classes can have abstract methods
//abstract methods does not have body
//we cannot create object of abstract class.
//child classes of the abstract class are responsible for to provide implementation for abtrsct methods.
//abtsract class can have concrete methods(methods with body) and abstract methods
fun main() {
 var audi_car:Car=Audi()  //upcasting
    var r=CarReapirShop()
    r.repairCar(audi_car)

    var bmw_car:Car=BMW()
    r.repairCar(bmw_car)

    r.repairCar(Swift())
    r.repairCar(Ciaz())
    //the class which does not have name is annonymous inner class
    r.repairCar(object : Car() {
        override var car_name: String="Alto"

        override fun repair() {
            println("please repair $car_name")
        }

    })

}
abstract class Car
{
  abstract var car_name:String
  abstract fun repair()

}

class Audi:Car()
{
    override var car_name: String="Audi"

    override fun repair() {
      println("please repair $car_name")
    }

}
class Ciaz:Car()
{
    override var car_name: String="Ciaz"

    override fun repair() {
        println("please repair $car_name")
    }

}
class BMW:Car()
{
    override var car_name: String="BMW"

    override fun repair() {
        println("please repair $car_name")
    }

}
  class Swift:Car()
{
    override var car_name: String="Swift"

    override fun repair() {
        println("please repair $car_name")
    }

}
class CarReapirShop
{
    fun repairCar(car:Car)
    {
       car.repair()
    }
}