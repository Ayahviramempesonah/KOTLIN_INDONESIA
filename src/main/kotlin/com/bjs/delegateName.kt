/*package com.bjs
import kotlin.reflect.KProperty


class DelegateName {
    var value:String="meong"
      operator fun getValue(classRef:Any?,property:KProperty<*>):String{
          println("fungsi getter dipanggil")
          return value
      }
    operator fun setValue(classRef: Any?,property: KProperty<*>,newValue:String) {


        println("fungsi setter di panggil")
        value = newValue
    }
}
class animal (){
    var sesuatu:String by DelegateName("jhdii")
}
fun main(){

   var waw= DelegateName()
    waw.getValue("ahh")
}// ini masih pr */