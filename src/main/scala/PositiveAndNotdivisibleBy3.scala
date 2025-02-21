object PositiveAndNotdivisibleBy3 {
def main(args: Array[String]): Unit={
  /*
Check for Positive AND Not Divisible by 3:
Implement a Scala program to check if a given number is positive and not divisible by 3.
Sample Data:
Number: 7
   */
  val num= 7
  if(num>0 && num%3!=0){
    println(num+" is positive and not divisible by 3")
  }
  else{
    println(num+" is either not positive or divisible by 3")
  }
}
}
