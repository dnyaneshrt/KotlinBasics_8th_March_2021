package encapsulation

fun main() {
    var nikhil = Student("abcd", "12345")
    println(nikhil.username)

}

class Student( uname:String, pass:String) {

var username=uname
    set(value) {
        field = if(value.length > 6) value else
            print("too small password").toString()

    }
    get() {
        return field
    }
}
