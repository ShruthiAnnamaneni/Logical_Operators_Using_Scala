object SeniorAndStudentDiscount {
def main(args: Array[String]): Unit={
  /*
Eligibility for Senior Discount AND Student Discount:
Create a Scala program to check if a person is eligible for both a senior citizen discount (age greater
than 60) and a student discount (age less than 25).
Sample Data:
Age: 70
   */
  val Age=70
  if(Age<25 && Age>60){
    println("eligible for both senior citizen and student discount")
  }
  else if(Age>60){
    println("eligible for senior citizen discount")
  }
  else {
    println("eligible for student discount")
  }
}
}
