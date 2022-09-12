package com.madhu.functional

object ExampleTrait {

  trait Logger {
    def log(data:String)
    def formattedLogger(data:String) = ???
  }
  case class FileLogger() extends Logger {
    override def log(data: String): Unit = println(data)
  }

  def main(args: Array[String]): Unit = {
    val fileLogger = FileLogger()
    fileLogger.log("string value")
    fileLogger.formattedLogger("String valiue")
  }
}
