package string

fun main() {
    println("please enter your string")
    var sentence = readLine()

    var rev = ""
//    var len = sentence!!.length
    var words = sentence!!.split(" ")
    for (word in words) {

        for (i in word.length - 1 downTo 0) {
            rev = rev + word.get(i)
        }
        rev=rev+" "
    }


    println("after revrseing string is \n\n$rev")
}