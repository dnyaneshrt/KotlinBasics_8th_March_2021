package exception

fun main() {

    try {
        println("please enter the index number")
        var index= readLine()!!.toInt()
        //max 4 index u can pass here
        var arr=arrayOf(3,5,80,99,55)
        println(arr.get(index))
    }
    catch(e:Exception)
    {
       println(" ${e.printStackTrace()}")
    }
    finally {
        println("finally block exceutes no matter")
    }
    println("imp code")
    println("imp code")

}