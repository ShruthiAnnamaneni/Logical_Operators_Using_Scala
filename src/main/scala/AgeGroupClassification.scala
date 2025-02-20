object AgeGroupClassification {
  def main(args: Array[String]): Unit={
    /*Create a Scala program to classify a person's age group. Classify them as a child (less than 13),
teenager (between 13 and 19), and an adult (20 and above) using both logical AND and OR.
Sample Data:
Age: 15 */
    var age=15
    if(age>=13 && age<=19){
    println("Teenager")
    }
    else if(age<13 || age>=20){
      if(age<13)
        {
          println("Child")
        }
        else{
          println("adult")
        }

    }
  }

}
