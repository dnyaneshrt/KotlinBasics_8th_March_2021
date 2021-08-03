package string


fun main() {
    var test_string = "hello My name is Dnyaneshwar"
    var other_string = "Create a professional resume with 8+ of our free resume templates"
    var words = test_string.split(" ")
    println("number of chars in my string is= ${test_string.length}")
    println("number of words available in my string is= ${words.size}")
    var i = 1
    for (word in words) {
        println("${i++} $word")
    }

    println(" 3rd char from my string  ${test_string.get(2)}")
    println(test_string.plus(other_string))
    var check_equality = test_string.equals("Create a professional resume with 8+ of our free resume templates")
    println(check_equality)
    println(test_string.toLowerCase())
    println(test_string.toUpperCase())
    println(test_string.contains('8'))//true
    println(test_string.contains('9'))//false
    println("last char from my string is =${test_string.get(test_string.length - 1)}")

    var rev = ""
    for (n in test_string.length - 1 downTo 0) {
        rev = rev + test_string.get(n)
    }
    println("my string in reverse order =${rev}")

}