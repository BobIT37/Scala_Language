object Sc_05_Functions{
  def abs(x:Int) = if(x < 0) -x else x
  abs(-5)

  def fac(n:Int) = {
    var r = 1
    for(i <- 1 to n)
      r = r * i
      r
  }
  fac(5)

  def factorial(n:Int):Int = if(n<=0) 1 else n * factorial(n-1)
  factorial(5)

  def printName(firstName:String, lastName:String): Unit ={
    println(firstName+ " "+ lastName)
  }

    printName(firstName= "ilhan", lastName="turkmen")
    printName(lastName="turkmen", firstName= "ilhan")

  def printName2(left:String="[", firstName:String, lastName:String, right:String="]") {
    println(left+firstName+ " "+ lastName+ right)
  }
  printName2(lastName = "turkmen", firstName = "ilhan")

  def sum(args:Int*)={
    var result = 0
    for(arg <- args) result += arg
    result
  }
  sum(1,2,3,4,5)
}