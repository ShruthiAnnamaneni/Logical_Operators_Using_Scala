object lessthanORgreaterthan {
def main(args: Array[String]): Unit={
  /*Create a Scala program to determine if a given value is either less than -10 or greater than 10.
  Sample Data:
    Value: -15 */
  val a= -15
  if(a< -10 || a> 10 ){
    println("given value is either less than -10 or greater than 10")
  }
  else{
    println("given value is in between -10 and 10")
  }
}
}
