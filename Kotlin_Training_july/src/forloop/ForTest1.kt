package forloop

//ranges ..
//step
//downTo to get in reverse order,until
fun main() {

    var range=1..50
//    println(range)

    //for(int num=1;num<=50;num++)
    for(num in range)
    {
      println(num)
    }
    println("nums are in diff 5")
    //for(int num=1;num<=50;num=num+5)
    for(num in range step 5)
    {
        println(num)
    }
    println("numbers are in reverse order")
    //for(int num=50;num>=1;num--)
    for(num in 50 downTo 1)
    {
        println(num)
    }
    //for(int num=1;num<50;num++)= 49

    for(num in 1 until 50)
    {
        println(num)
    }

}