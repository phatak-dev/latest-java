package com.madhu.functional

object FunctionalOperators {

  def main(args: Array[String]): Unit = {
    val simpleFunction = (x:Int) => x+10
    println(simpleFunction(10))

    val noReturnFunction = (x:Int) => println(x)
    noReturnFunction(10)

    val noInputFunction = () => 10
    println(noInputFunction)
  }

}
