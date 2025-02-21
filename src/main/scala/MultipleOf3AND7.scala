object MultipleOf3AND7 {
  def main(args: Array[String]): Unit={
/* Check for Multiple of 3 AND 7:
Implement a Scala function to check if a given number is both a multiple of 3 and 7.
Sample Data:
Number: 21 */
    val num=21
    if(num%3==0 && num%7==0){
      println("given number is multiple of both 3 and 7" )
    }
    else{
      println("given number is not multiple of both 3 and 7")
    }


  }

}
