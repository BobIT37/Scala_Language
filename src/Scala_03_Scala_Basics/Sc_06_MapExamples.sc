object Sc_06_MapExamples{
  var groceries = Map(1 -> "milk", 2 -> "bread", 3 -> "juice", 4 ->"eggs")

  groceries = groceries+(5->"hashbrowns")
  groceries.get(3)
  groceries(3)
  groceries.getOrElse(6,"No Match")
  for(v<-groceries.values)println(v)

  var z = for((k,v)<-groceries) yield (v,k)
  groceries.foreach(println)

}