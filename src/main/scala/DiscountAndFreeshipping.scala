object DiscountAndFreeshipping {
def main(args: Array[String]): Unit={
  /*
 Eligibility for Discount AND Free Shipping:
Create a Scala program to check if a customer is eligible for a discount (purchase amount greater
than 150) and qualifies for free shipping (purchase amount greater than 100).
Sample Data:
Purchase Amount: 120
   */
  var amount=160
  if(amount>150 && amount>100){
    println("Customer eligible for discount and qualifies for free shipping")
  }
  else if(amount>100){
    println("customer qualifies for free shipping")
  }
}
}
