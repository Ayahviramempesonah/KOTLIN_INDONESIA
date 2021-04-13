package com.bjs



open class overloading(val kendaraan:String, val roda:Int, val harga:String) {
    open fun punya(human:String="manusia"){
        println("$kendaraan ini punya saya $human ")
    }fun punya(){
        println("$kendaraan ya iyalah")
    }fun punya3(){
        println("$roda ya mantap jiwa $harga")
    }
}
class mobil2(val satu:String ):overloading("honda",2,"maahal"){
    fun iki(){

        println("$satu mmobil idaman")
    }
}

fun main (){
    val reality=overloading("vario",2,"mahal")
    reality.punya()
    val reality2=mobil2("jazz")
    println(reality2)
    reality2.iki()
    reality.punya("manusia")  // pada contoh ini kita telah menggunakan
                                         // fungsi overloading perhatikan code disamping
    reality.punya()

}