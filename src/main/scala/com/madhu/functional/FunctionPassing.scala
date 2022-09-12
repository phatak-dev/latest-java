package com.madhu.functional

object FunctionPassing {
  def increment(value:Int,incrementFunction:(Int)=>Int) = {
    incrementFunction(value)
  }
  val value = 10
  val result = increment(value, v=>v+10)
}
