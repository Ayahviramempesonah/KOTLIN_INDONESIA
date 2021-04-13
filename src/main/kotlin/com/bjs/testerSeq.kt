package com.bjs
//import kotlinx.coroutines.*

class testerSeq {
}
val gobis =listOf("mcd","hokben","burger king","dominos pizza","martabak orien","kopi kenangan","solaria","yoshinoya")
 fun main() {
     println("OK")
     println(gobis)
     gobis.asSequence().filter {
         println("filtering $it")
         it.contains("z")
     }.map {
         println("mapping dijalankan $it")
     }.forEach {  }

println("=========== beda sequenceses =======")








}