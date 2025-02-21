object DivisibilityBy4or6 {
def main(args: Array[String]): Unit={
  /*
Divisibility by 4 OR 6:
Write a Scala program to check if a given number is divisible by either 4 or 6.
Sample Data:
Number: 18
   */
  val num=18
  if(num%4==0 || num%6==0){
    println(num+ " is divisible by either 4 or 6")
  }
  else{
    println(num+" do not satisfy required condition")
  }
}
}
