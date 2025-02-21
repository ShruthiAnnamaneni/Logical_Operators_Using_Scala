object NonNegativeOReven {
def main(args: Array[String]): Unit={
  /*
  10)Check for Non-Negative OR Even Number:
Create a Scala program to check if a given number is either non-negative or even.
Sample Data:
Number: -8
   */
  val a= -8
  if(a>0 || a%2==0){
    println(a+ " is either non-negative or even")
  }
  else{
    println(a+" do not fall under given condition ")
  }
}
}
