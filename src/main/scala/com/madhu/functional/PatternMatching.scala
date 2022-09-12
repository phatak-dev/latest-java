package com.madhu.functional

object PatternMatching {

  sealed trait SomeValue

  case class MyValue(myValue: Int) extends SomeValue
  case class YourValue(yourValue: Int) extends SomeValue

  def main(args: Array[String]): Unit = {
    val someValue:SomeValue = YourValue(10)

    someValue match {
      case MyValue(_) =>
    }

  }

}
