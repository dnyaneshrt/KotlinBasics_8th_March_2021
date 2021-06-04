package march18

import java.util.*

fun main() {

    // List,Queue,Set,Map

    //mutable and immutable

    var listEmployees = mutableListOf<String>("amruta", "vallabh", "sumeet", "swati")

    listEmployees.add("dnyanneshwar")
    listEmployees.add("niranjan")
    listEmployees.add("neha")

    var count = 1
    for (employee in listEmployees) {
        println("$employee ${count++}")
    }

    println("total number of employees in compammnny= " + listEmployees.size)
    println(listEmployees.get(3))
    println(listEmployees.last())
    println("the removed employee is" + listEmployees.removeAt(5))
    println("after updating the list of emplyees")

    for (employee in listEmployees) {
        print("  - $employee")
    }


    var newEmployees = mutableListOf<String>("jagruti", "neha", "prashant", "prachi")
    for (i in 0 until newEmployees.size) {
        listEmployees.replaceAll {
            newEmployees.get(i).replace('p', 'P')

        }
        println("\n" + newEmployees.get(i).replace('p', 'P'))
    }

//set
 /*   var listStates = mutableSetOf<String>()

    println("enter 5 states:")
    for (state in 0..4) {
        listStates.add(readLine()!!)
    }
    println("the entered 5 states are:")
    for (state in listStates) {
        println(state)
    }

    println("the entered 5 states are after converting into capital:")
    listStates.forEach {
        println(it.toUpperCase().toString())
    }
    listStates.forEach {
        println(it.plus(" techsum"))
    }
*/
println("the list of the employyeees along with id's")
    var employees = mutableMapOf<Int, String>()
    employees.put(101, "vallabh")
    employees.put(102, "sumeet")
    employees.put(103, "swati")
    employees.put(104, "amruta")

    for (employee in employees)
    {
        println(employee)
    }
    println(employees.getValue(104))

    var mylist= mutableListOf<String>("tryth","jasdf","dfgfsg","zyytu")
    Collections.sort(mylist)
    println("employees after sorting")
    for(employee in mylist)
    {
        println(employee)
    }
}