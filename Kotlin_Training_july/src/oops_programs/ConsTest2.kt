package oops_programs

//this() is used to call other construtors
fun main() {
    ConsTest2()//it will call sec
}
class ConsTest2(name: String) {
    init {
        println(" init block:  name got from sec cons= $name")
    }

    constructor() : this("dnyaneshwar") {
        print("sec constructor:  this is sec cons")
    }

}