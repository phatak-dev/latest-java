package com.madhu.functional

object HigherOrderFunctions {

  def main(args: Array[String]): Unit = {
    def inputFormatter(value:String, fmt:(String) => String):String= {
      fmt(value)
    }

    def delayedSupplier(data:String) = {
      () => "length of the string is " + data.length
    }

    val formattedValue = inputFormatter("hello world" ,(value) => "the formatted value is :" + value)
    println(formattedValue)

    val delayedSupplierRef = delayedSupplier("hello world")
    println(delayedSupplierRef())

  }

}
