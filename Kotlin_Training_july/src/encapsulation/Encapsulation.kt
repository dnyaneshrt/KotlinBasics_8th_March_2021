package encapsulation

fun main() {
    var nikhil = Student("abcd", "12345")
    nikhil.username = "abc"
    println("password= ${nikhil.password}")

}

class Student(uname: String, pass: String) {

    var username = uname
        set(value) {
            if (value.length > 5) {
             field=value
            } else {

                println("username is too small")
            }
        }

    var password=pass
    get() {
        return field
    }
}
