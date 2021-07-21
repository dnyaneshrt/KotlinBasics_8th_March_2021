package inheritance

fun main() {
    FirstChild().property()
    SecondChild().property()
    ThirdChild().property()
}
open class HirachicalTest {
    fun property()
    {
        println("this is imp property")
    }
}
class FirstChild:HirachicalTest()
{

}
class SecondChild:HirachicalTest()
{

}
class ThirdChild:HirachicalTest()
{

}