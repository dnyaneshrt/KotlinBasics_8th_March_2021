package forloop

//4!=4*3*2*1=24
//5!=5*4!=120

fun main() {

    println("Enter any number")
    var num= readLine()!!.toInt()
    var fact=1
    //for(int x=1;x<=num;x++)
    //1   1=1*1=1
    //2   2=1*2=2
    //3   2=2*3=6
    //4   6=6*4=24
   for(x in 1..num)
   {
       fact=fact*x
   }
    print("factorial of $num of $fact")
}