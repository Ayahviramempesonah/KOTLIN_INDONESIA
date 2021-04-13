package com.bjs



open class inheritance(val kendaraan:String, val roda:Int, val harga:String) {
    open fun punya(){
        println("$kendaraan ini punya saya ")
    }fun punya2(){
        println("$roda ya iyalah")
    }fun punya3(){
        println("$harga ya mantap jiwa")
    }
}
class mobil(val satu:String ):inheritance("honda",2,"maahal"){
   fun iki(){

       println("$satu mmobil idaman")
   }
}

fun main (){
    val reality=inheritance("vario",2,"mahal")
    reality.punya()
    val reality2=mobil("jazz")
println(reality2)
    reality2.iki()
}