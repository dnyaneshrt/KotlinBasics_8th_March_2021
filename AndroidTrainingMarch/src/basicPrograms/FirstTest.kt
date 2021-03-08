package basicPrograms

fun main()
{
    var num1=15//immutable
    num1=50

    val url:String="www.google.com"
    var today:Byte=8

    var name:String?=null
    name="dnyaneshwar"
    println("length if name is= ${name!!.length}")

    println("enterd url is= ${"http:\\\\"+url}")
    println("value of num1 id :$num1")
    println("todays date id $today march")
    println("tomarrow's date id ${today+1} march")

}

