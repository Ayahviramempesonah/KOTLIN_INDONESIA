package com.bjs

class getterorSetter(var negara:String,var gaji:Int) {
    var hewan:String="kucing"
    get(){
        println("fungsi getter di panggil")
        return field.toUpperCase()
    }set(value) {
        println("fungsi setter dipanggil")
        field=value
    }
fun keinginan(){
    println("$negara keinginanku")
}fun umr(){
    println("$gaji harapan penghasilan")
}



}

fun main(){
    val saatINi=getterorSetter("australia",
    5000000)
    println(saatINi.gaji)
    println(saatINi.negara)
    saatINi.keinginan()
    saatINi.umr()
    println(saatINi.hewan)
    saatINi.hewan="meong"
    println(saatINi.hewan)
}



