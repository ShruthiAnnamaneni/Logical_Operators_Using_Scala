object OddAndNotdivisibleBy4 {
def main(args: Array[String]): Unit={
  /*
Check for Odd AND Not Divisible by 4:
Create a Scala program to check if a given number is both odd and not divisible by 4.
Sample Data:
Number: 15
   */
  val num=15
  if(num%2!=0 && num%4!=0){
    println(num+" is both odd and not divisible by 4")
  }
  else{
    println(num+" is not both odd and divisible by 4")
  }
}
}
