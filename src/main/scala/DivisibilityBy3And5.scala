object DivisibilityBy3And5 {
def main(args: Array[String]): Unit={
  /*
Check for Divisibility by 3 AND 5:
Write a Scala function to check if a given number is divisible by both 3 and 5.
Sample Data:
Number: 15
   */
  val i=15
  if(i%3==0 && i%5==0){
    println(i+" is divisible by both 3 and 5")
  }
  else{
    println("do not satisfy the divisibility condition of 3 and 5")
  }
}
}
