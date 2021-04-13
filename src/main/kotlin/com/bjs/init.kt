package com.bjs

class init ( val negara:String, val ibukota:String,val gaji:Int,val betah:Boolean){
fun myHope(){
    println("$negara this my country")
}fun myHope2(){
    println("$ibukota ibu yang kejam")
}
}
fun main(){
    val iki=init("indonesia","djakarta",5000000,true)
    println(iki.negara)
    println(iki.ibukota)
    contohInit("ayah vira mempesonah",31,true)
}
class contohInit(  name:String,
                  age:Int,
                   maried:Boolean){

init { println("""
            ini contoh penggunaaan block init
                my profile:
                my name:$name
                my age: $age
                my status:$maried
           """.trimIndent())


}
     /*   println("""
            ini contoh penggunaaan block init
                my profile:
                my name:$name
                my age: $age
                my status:$maried
           """.trimIndent())*/

}
