object DivisibilityBy5or9 {
def main(args: Array[String]): Unit={
  /*
Divisibility by 5 OR 9:
Write a Scala program to check if a given number is divisible by either 5 or 9.
Sample Data:
Number: 45
   */
  val b=45
  if(b%5==0 || b%9==0){
    println(b+" is divisible by either 5 or 9")
  }
  else{
    println("do not satisfy the divisibility condition of 5 or 9")
  }
}
}
