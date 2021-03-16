package march16

fun main() {
    //1
    var myClass= object : Bank {
        override fun bankInfo() {
           println("this is an annonymous bank")
        }
    }
    myClass.bankInfo()

    //2
object : Bank {
        override fun bankInfo() {
        println("2nd annonymous bank")
        }
    }.bankInfo()


    //->()  lamda expression in java

//3
  Bank {
       println("from lamda")
    }.bankInfo()


    //4
    var school=School{
      println("this is the lamda school")
    }
    school.schoolInfo()

   // val isEven = IntPredicate { it % 2 == 0 }

    var obj=Axis()
    obj.bankInfo()
    obj.schoolInfo()

}
//mutliple imheritance is supported in case of interface
open fun interface Bank
{
    fun bankInfo()
}
//functional interface
open fun interface School
{
    fun schoolInfo()
}
//marker interface(empty interfaces)
interface Android
{

}

class Axis: Bank,School
{
    override fun bankInfo() {
        println("this is an Axis bank")
    }

    override fun schoolInfo() {
        println("this is an lexicon school")
    }

}