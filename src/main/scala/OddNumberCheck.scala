object OddNumberCheck {
def main(args: Array[String]): Unit={
  /*
Odd Number Check with AND:
Implement a Scala function to check if a given number is odd and not divisible by 3.
Sample Data:
Number: 27
   */
  val num=27
  if(num%2!=0 && num%3!=0){
    println(num +" is odd and not divisible by 3 ")
  }
  else{
    println(num+ " do not satisfy the given condition ")
  }
}
}
