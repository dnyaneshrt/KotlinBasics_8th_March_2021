package string


//trim() method removes blank spaces from both sides of string
fun main() {
    var username="android"
    var password="12345"
    println("please enter username")
    var uname=readLine()!!.trim()
    println(uname?.length)

    println("please enter password")
    var pass=readLine()!!.trim()
    println(pass?.length)

    if(username.equals(uname)&&password.equals(pass))
    {
        println("welcome to dashboard")
    }else
    {
        println("may be wrong username or password")
    }
}