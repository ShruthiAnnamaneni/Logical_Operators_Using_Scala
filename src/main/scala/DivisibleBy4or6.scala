object DivisibleBy4or6 {
def main(args: Array[String]): Unit={
 /* Check for Divisibility by 4 OR 6:
    Create a Scala function to check if a given number is divisible by either 4 or 6.
  Sample Data:
    Number: 24
  */
 val num=24
  if(num%4==0 || num%6==0){
    println(num+ " is divisible by either 4 or 6")
  }
  else{
    println(num+" is not divisible by both 4 and 6")
  }
}
}
