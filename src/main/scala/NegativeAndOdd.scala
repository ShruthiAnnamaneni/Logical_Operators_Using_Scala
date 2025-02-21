object NegativeAndOdd {
def main(args: Array[String]): Unit={
  /*
Check for Negative AND Odd Number:
Implement a Scala program to check if a given number is both negative and odd.
Sample Data:
Number: -7
   */
  val a= -7
  if(a<0 && a%2!=0){
    println(a+ " is negative and odd")
  }
  else{
    println(a+ " do not satisfy given condition")
  }
}
}
