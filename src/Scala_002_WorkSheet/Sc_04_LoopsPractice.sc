object Sc_04_LoopsPractice{

  //while
  var x = 10
  while(x >= 0) {
    println(x)
    x -= 1 //same as x = x - 1
  }
  println("ilhan...")

  //do while
  var y = 10
  do{
    println(y)
    y -= 1
  }while(y >= 0)
  println("Bob...")

  //for loop
  var m  = 10
  for(m <- 10 to 0 by -1){
    println(m)
  }
  println("Jackson..")

  var h = for(num <- 1 to 10) yield num + 1

  var word = "Monday"
  for(b <- 0 until word.length) {
    println(word(b))
  }
}