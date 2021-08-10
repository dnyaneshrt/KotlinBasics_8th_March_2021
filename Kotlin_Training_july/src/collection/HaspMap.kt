package collection

//key value pair
//roll no.-names<Int,String>
//first name-lastname<String,String>
//mobile_number-names
fun main() {
    var hashMap = HashMap<Int, String>()
    hashMap.put(1, "rupali")
    hashMap.put(2, "nikhil")
    hashMap.put(3, "vaishali")
    hashMap.put(4, "radhika")
    hashMap.put(5, "komal")
    hashMap.put(6, "rahul")
    hashMap.put(7, "shradha")

    println(hashMap)
    println(hashMap.get(4))
    for (key in hashMap.keys) {
        println("$key ${hashMap.get(key)}")
    }
    println("total no.of elements in hashmap are ${hashMap.size}")
    hashMap.replace(3, "vaishali wadikar")
    for (key in hashMap.keys) {
        println("$key ${hashMap.get(key)}")
    }
    hashMap.put(8, "dummy")
    for (key in hashMap.keys) {
        println("$key ${hashMap.get(key)}")
    }
    hashMap.remove(8)
    for (key in hashMap.keys) {
        println("$key ${hashMap.get(key)}")
    }

    hashMap[8]="new student"
    for (key in hashMap.keys) {
        println("$key ${hashMap.get(key)}")
    }
//   hashMap.clear()//clear method removes all elements
//    println("total no.of elements in hashmap are ${hashMap.size}")
    println("hashmap elements using entries")
    var entries=hashMap.entries
    for(entry in entries)
    {
        println(entry)
    }

}