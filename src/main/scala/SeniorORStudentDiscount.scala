object SeniorORStudentDiscount {
def main(args: Array[String]): Unit={
  /*
  8)Eligibility for Senior Discount OR Student Discount:
Create a Scala program to check if a person is eligible for a senior citizen discount (age greater than
60) or a student discount (age less than 25).
Sample Data:
Age: 63
   */
  val Age=63
  if(Age>60){
    println("eligible for senior citizen discount")
  }
  else if(Age<25){
    println("eligible for student discount")
  }

}
}
