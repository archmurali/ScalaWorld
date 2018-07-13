package mynewpack



object Main extends App{

  val listA = List(34,54,62,24,56)
  println(listA.max)
  println(s"The max number is ${listA.max}")
  print("AM")

  val ages = Seq(42, 75, 29, 64)
  println(s"The oldest person is ${ages.max}")

  def calc(a:String,b:Int,c:Int) : Int= {

    if(a=="add")  b + c
    else if(a =="subtract" && b>=c)  b - c
    else if(a =="subtract" && b<=c)  c - b
    else if(a =="multiply" && b>=c)  b * c
    else b/c
  }

 

  val divide = (x:Double) => 100/x
  println(divide(0))
}




