package com.bjs

class oop {
}
class hewan(val name:String,val age:Int){
    fun eat (){
        println("$name sedang makan")
    }
    fun turu(){
        println("$name sedang tidur")
    }
}
fun main(){
    val kewan=hewan("meong",9
    )
    println(kewan.name)
    println(kewan.age)
    kewan.eat()
    kewan.turu()
    // ini adalah contoh sederhana oop dan cara memanggilnya
    val harapan=negara("jakarta","pondok indah",15000000)
    println(harapan.prov)
    harapan.keinginan()
    harapan.bambang()
    harapan.prov
    println(harapan.umr)
}
class negara (val prov:String,val wil:String,val umr:Int){
    fun bambang(){
        println("$prov disini")
    }fun keinginan(){
        println("$wil pengen punya pacar")
    }

}
