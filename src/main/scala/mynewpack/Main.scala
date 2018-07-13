package mynewpack



object Main extends App{

  val listA = List(34,54,62,24,56)
  //println(s"The max number is ${listA.max}")

  def calc(a:String,b:Int,c:Int) : Int= {

    if(a=="add")  b + c
    else if(a =="subtract" && b>=c)  b - c
    else if(a =="subtract" && b<=c)  c - b
    else if(a =="multiply" && b>=c)  b * c
    else b/c
  }

  val divide = (x:Double) => 100/x
  //println(divide(0))

  abstract class Operation

  case class Add(a:Int,b:Int) extends Operation
  case class Subtract(a:Int,b:Int) extends Operation
  case class Multiply(a:Int,b:Int) extends Operation
  case class Divide(a:Int,b:Int) extends Operation


  def calculator(operation:Operation) :Int = operation match {

    case Add(a,b) => a+ b
    case Subtract(a,b)=>if(a>b) a-b else b-a
    case Multiply(a,b)=> a*b
    case Divide(a,b)=> if(b!=0) a/b else 0
  }

  val q = Divide(2,0)
  println(calculator(q))


  val li = List(1,2,3,4,5)

  println(li.isDefinedAt(0))
}




