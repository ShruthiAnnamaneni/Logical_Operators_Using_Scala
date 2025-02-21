object DivisibilityBy2or3 {
def main(args: Array[String]): Unit={
  /*
Divisibility by 2 OR 3:
Write a Scala function to check if a given number is divisible by either 2 or 3.
Sample Data:
Number: 9
   */
  var num=9
  if(num%2==0 || num%3==0){
    println(num+ " is divisible by either 2 or 3")
  }
  else{
    println("do not satisfy the divisibility condition of 2 or 3")
  }
}
}
