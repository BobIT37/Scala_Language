object Sc_06_HigherorderFns{
  val double = (i:Int) => i * 2
  def higherorder(x:Int, y:Int => Int) = y(x)
  higherorder(6, double)

  val triple = (i:Int) => i * 3
  higherorder(6, triple)

  def sayHello = (name:String) => {"Hello "+ " "+ name}
  var message = sayHello("ilhan")

  var y = 5
  val multiplier = (x:Int)=> x*y
  multiplier(10)
}