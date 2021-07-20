package oops_programs

fun main() {
    Person("Dnyaneshwar", 26)
}

class Person(name: String, age: Int) {
    var isOlderThanMe = false
    val myAge = 25
    var entered_age=0

    init {
        entered_age = age
        isOlderThanMe = entered_age > myAge
        if(isOlderThanMe)
        {
            print("$name is older than me")
        }else
        {
            print("$name is younger than me")
        }

    }
}