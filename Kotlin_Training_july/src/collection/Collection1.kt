package collection

//List,Set,Queue,Map
//list is ordered collection
//Set is unordered collection which does not allow duplicates
fun main() {
    var list =
        mutableListOf<String>("sunday", "monday", "tuesday", "wedenesday", "thursday", "friday", "saturday", "15")

    var set =
        mutableSetOf<String>("sunday","sunday", "monday", "tuesday", "wedenesday", "thursday", "friday", "saturday", "15")
    var list2 = mutableListOf<String>("rahul", "nikhil")
//    var listnames = mutableListOf<String>()
//
//    println("please enter names:")
//    for (name in 1..5) {
//        listnames.add(readLine()!!)
//    }
//    println("entered names are as follows")
//    for (name in listnames) {
//       println(name)
//    }
    list.add(2, "new String")
    for (l in list) {
        println(l)
    }
    println("list after removing an element")
    list.removeAt(3)
    for (l in list) {
        println(l)
    }
    println(list.size)
    list.reverse()
    println("list after reversing an element")

    for (l in list) {
        println(l)
    }

    list.replaceAll { e -> e.toString().toUpperCase() }
    for (l in list) {
        println(l)
    }
    list.addAll(list2)
    for (l in list) {
        println(l)
    }

    println("these are set values")
    for(s in set)
    {
        println(s)
    }
    set.forEach {
      println(  it+"**")
    }

}


