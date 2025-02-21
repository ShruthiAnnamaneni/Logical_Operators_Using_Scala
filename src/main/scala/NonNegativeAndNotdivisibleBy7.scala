object NonNegativeAndNotdivisibleBy7 {
def main(args: Array[String]): Unit={
  /*
Check for Non-Negative AND Not Divisible by 7:
Implement a Scala program to check if a given number is non-negative and not divisible by 7.
Sample Data:
Number: 14
   */
  val num= 14
  if(num>0 && num%7!=0){
    println(num+" is non-negative and not divisible by 7")
  }
  else{
    println(num+" is either negative or divisible by 7")
  }
  
}
}
