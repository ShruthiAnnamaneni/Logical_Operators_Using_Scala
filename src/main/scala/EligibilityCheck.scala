object EligibilityCheck {
def main(args: Array[String]): Unit={
  /*
Eligibility for Voting OR Driving:
Create a Scala program to check if a person is eligible to vote (age greater than or equal to 18) or
eligible to drive (age greater than or equal to 16).
Sample Data:
Age: 20
   */
  var Age=20
  if(Age>=18 && Age>=16){
    println("Person is eligible to vote and drive")
  }
  else if(Age>=16){
    println("person is eligible to drive")
  }

}
}
