object MultipleRangeCheck {
def main(args: Array[String]): Unit = {
  /*
Multiple Range Check:
Write a Scala function to check if a given number is in the range [1, 10] or [20, 30].
Sample Data:
Number: 25
   */
  val a=25
  if(a>=1 && a<=10){
    println(a + " is in the range [1,10]")
  }
  else if(a>=20 && a<=30){
    println(a+ " is in the range [20,30]")
  }
}
}
