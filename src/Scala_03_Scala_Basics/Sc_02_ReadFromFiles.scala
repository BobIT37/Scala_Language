package Scala_03_Scala_Basics

import io.Source._

object Sc_02_ReadFromFiles extends App{
  val fileName = "src/Scala_03_Scala_Basics/rainbow.txt"
  for(line <- fromFile(fileName).getLines()){
    println(line.toUpperCase())
  }
  val poemLines = fromFile("src/Scala_03_Scala_Basics/poem.txt").getLines().toList
  poemLines.foreach(println)


}
