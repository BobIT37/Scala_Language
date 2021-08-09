package Scala_001_HelloWorld

object Sc_01_HelloWorld {

  def main (args: Array[String]): Unit = {

  //this is first scala program
  println("Hello world")

  /*
  declare variables
   */
   var firstName:String = "Peggy" //variable is mutable that means you can change it.
   val age:Int = 21 //val is mutable, cannot change
   println(firstName + " is "+ age+ " years old")
   var sum = 10+25
   def function1:Unit = {
     println("This is a function")
   }
   function1
  }

}
