object DivisibilityBy2or5 {
def main(args: Array[String]): Unit={
  /*
Check for Divisibility by 2 OR 5:
Write a Scala function to check if a given number is divisible by either 2 or 5.
Sample Data:
Number: 25
   */
  var num=25
  if(num%2==0 || num%5==0){
    println(num+ " is divisible by either 2 or 5")
  }
  else{
    println("do not satisfy the divisibility condition of 2 or 5")
  }
}
}
