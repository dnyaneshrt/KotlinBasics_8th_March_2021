package forloop

fun main(args:Array<String>)
{
    var count=0
    for(i in 1..5)
    {
        for(j in 1..i)
        {
            count++
            print(" $count")
        }
        println()
    }
}