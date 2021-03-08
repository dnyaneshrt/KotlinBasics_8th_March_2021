package basicPrograms

fun main()
{
    println("i am from main")
    var result:Int?=null
  result= add(10,12)//function calling
    println("additon of two numbers is= $result")
    println("multiplication of two numbers is= ${multiply(10,20)}")
   welcome()//function calling
}

//in kotlin we don't void keyword.
//no need to use new keyword while creating object

fun add(num:Int,num2:Int):Int
{
    return num+num2
}

fun multiply(a:Int,b:Int)=a*b

fun welcome()=println("welcome to inline functions")

