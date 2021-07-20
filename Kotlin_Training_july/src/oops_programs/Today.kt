package oops_programs

//secondry cons
//-we can have any number of secondry cons.
//can we overload the constructors?  ==>yes
//can we override the constructors?  ==>no
//for every object init bloak exceutes

fun main() {

    Today("Dnyaneshwar")
    Today()
    Today("android","20 july")
}
class Today {
    init {
        println("i am from init block")
    }
    constructor()    {
        println("1.  secondry constructor")
        println("today is 20 july")
    }
    constructor(name:String)
    {
        println("2.  secondry constrctor")
        println("the name i $name")
    }

    constructor(name:String,date:String)
    {
        println("3.  secondry constrctor")
        println("the name i $name and date is $date")
    }


}