package com.scala.pengsh.study

/**
 * @author pengsh
 * @Date 2020/9/4
 */
object HelloWord {
  def int(a:Int,b:Int): Int ={
    a+b;
  }
  def main(args: Array[String]): Unit = {
   // var a=int(1,2)
    val a=(a:Int,b:Int)=>{a*b}
    var c=(a1:Int,b2:Int) => {a1*b2}
    val r=a(1,3)
    println(r)
    println("Hello Word Scala")
  }
}
