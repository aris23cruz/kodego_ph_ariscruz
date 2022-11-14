package assignments

import java.util.*
import kotlin.collections.ArrayList

//Identify 3 uses cases that will efficiently use an Array, ArrayList, Set, Map.
fun main(){
    //3 uses cases of Array
    //fixed size, immutable, read only
    val array = arrayOf(1,2,3,"John")
    println(array.contentToString())

    println(array.first())
    println(array.last())

    array[0] = 10
    array[1] = 30
    println(array.contentToString())

    println(array.indexOf("John"))

    //3 uses cases of ArrayList
    //mutable, No fixed size, can add or remove elements

    val list = ArrayList<String>()
    list.add("Scottie")
    list.add("Mike")
    list.add("Dennis")

    list.remove("Dennis")
    list.add(2,"Karl")

    list[1] = "Kobe"

    for (element in list){
        println(element)
    }

    for (index in 0 until list.size){
        println(list[index])
    }

    //3 uses cases of Set
    //Immutable,read only, contains unique elements
    val mySet = setOf<Int>(1,3,13,23,33,91,6,3,3,5)
    for (element in mySet){
        println(element)
    }
    println(mySet.size)
    println(mySet.indices)
    println(mySet.sum())

    //3 uses cases of Map - key/value pairs
    //Immutable, fixed size, read only
    val jerseyMapper = mapOf<String, Int>("Scottie" to 33, "Mike" to 23, "Dennis" to 91)
    println(jerseyMapper)
    //jersey of Mike
    println(jerseyMapper["Mike"])
    //size of elements
    println(jerseyMapper.size)
}