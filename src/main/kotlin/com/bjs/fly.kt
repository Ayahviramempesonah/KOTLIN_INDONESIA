package com.bjs
//import com.bjs.Menghitung
data class fly( val name : String,val age : Int)

fun main () {
    val buka = fly(




        " putri agung ",
        99
    )
    println (buka)
    val negara=mapOf(
        "indonesia" to "jakarta",
        "english" to "london",
        "us" to "new york" )
    val modNegara = negara.toMutableMap()
      modNegara [ "arab saudi"]  ="makkah"
val nyobaSeq = listOf<String>("mana","mungkin","selimut","tetangga","hinggapi","tubuhku","dalam","kesepian")
   // println(nyobaSeq)
    nyobaSeq.filter  {
        println("filtering $it")
        it.contains(other =" u")
        //  println(nyobaSeq)
    }.map {
        println("mapping dijalankan $it")
        it. toUpperCase()
    } .forEach{
      println(it)
    }

val manusia = setOf("ayah","vira","mempesonah",99)
    val manlist = listOf<String,>("kontol","mememk")
    val belejarTo= manusia.toSet()
    println("kan kontol $belejarTo")
    println(manusia)
    println(manlist)
    println("belajar maps")
    println(negara.keys)
    println(negara.values)
    println(negara)
    println(modNegara)
}