object NonpositiveAndEven {
def main(args: Array[String]): Unit={
  /*
Check for Non-Positive AND Even Number:
Implement a Scala program to check if a given number is both non-positive and even.
Sample Data:
Number: -6
   */
  val a= -6
  if(a<0 && a%2==0){
    println(a+ " is both non-positive and even")
  }
  else{
    println(a+" do not fall under given condition ")
  }
}
}
