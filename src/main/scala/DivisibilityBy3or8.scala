object DivisibilityBy3or8 {
def main(args: Array[String]): Unit={
  /*
Divisibility by 3 OR 8:
Write a Scala function to check if a given number is divisible by either 3 or 8.
Sample Data:
Number: 24
   */
  val num=24
  if(num%3==0 || num%8==0){
    println(num+ " is divisible by either 3 or 8")
  }
  else{
    println(num+ " is not divisible either by 3 or 8")
  }
}
}
