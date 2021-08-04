package encapsulation
//get() and set() method
/*
set(value)
{
field=value
}
get()
{
return field
}
 */
fun main() {
    var p1 = Person("A",1)
    p1.age=56//set() is being called
    p1.nameE="lmnopq"//set() is being called

    println("name of person =${p1.nameE}")//get
    println("age of person= ${p1.age}")
}

class Person(nameP: String, ageP: Int) {
  var nameE = nameP
        set(value) {

            if (value.length < 5) {
                println("name is too small")
            } else {
                field = value
            }
        }
        get() {
            println("name get called")
            return field.toUpperCase()
        }
    var age = ageP
        set(value) {
            if (value < 0) {
                println("age canot be negative")
            } else {
                field = value
            }
        }
        get() {
            println("age get called")
            return field
        }
}
