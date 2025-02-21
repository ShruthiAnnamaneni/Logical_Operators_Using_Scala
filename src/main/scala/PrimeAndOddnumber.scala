object PrimeAndOddnumber {
  def main(args: Array[String]): Unit = {
    /*
  11)Check for Prime AND Odd Number:
Write a Scala function to check if a given number is both a prime number and an odd number.
Sample Data:
Number: 17
   */
    val a = 17
    var count = 0
      for (i <- 1 to a) {
        if (a % i == 0) {
          count = count + 1
        }
      }
        if (count == 2 && a%2 !=0) {
          println(a + " is both prime and odd")
        }
        else {
          println(a + " is not both prime and odd")
        }

      }


}


