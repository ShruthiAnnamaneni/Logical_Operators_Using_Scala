object DivisibilityBy5And7 {
def main(args: Array[String]): Unit={
  /*
Divisibility by 5 AND 7:
Write a Scala function to check if a given number is divisible by both 5 and 7.
Sample Data:
Number: 35
   */
  var num=35
  if(num%5==0 && num%7==0){
    println(num+" is divisible by both 5 and 7")
  }
  else{
    println(num+ " do not satisfy required condition ")
  }
}
}
