package march17

fun main() {
    var mystring = "Apply the differences between panes in the Differences viewer using"

    println("the length of the above string is= ${mystring.length}")

    var words = mystring.split(" ")
    println("total number of words= ${words.size}")

    for (word in words) {
        println(word)
    }

    var username = "Dnyaneshwar"
    println("the length of the String is ${username.trim().length}")
    println("the length of the String is ${username.trimStart().length}")
    println("the length of the String is ${username.trimEnd().length}")

    var username2 = "dnyaneshwar"
    if (username.trim() == username2.trim()) {
        println("same string")
    } else {
        println("not same")
    }

    if (username.equals(username2)) {
        println("same")
    } else {
        println("not same")
    }

    println(username.equals(username2, ignoreCase = true))

    println("the char at 3rd position ${username.get(2)}")

    var rev = ""
    //11-1
    for (i in username.length - 1 downTo 0) {
        rev = rev + username.get(i)
    }
    //username.get(10) ==r

    println("the extpected reverse String is= $rev")

    println("after concatenating username and username2 is ${username + " " + username2}")
    var available = username.contains("w")
    println("w is $available")

    println("x is ${username.contains("x")}")

    var email = "dnyaneshwar@gmail.com"
    if (email.endsWith("gmail.com")) {
        println("valid email id")

    } else {
        println(" in-valid email id")
    }

    var number1 = "15"
    var number2 = "25"
    var number3 = 40

    println("after adding all three numbers ${number1.toInt() + number2.toInt() + number3}")

    var newString = "egjgjegfhgz"
    println(newString.findLast {
           true
    })
}

