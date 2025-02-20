object DiscountORfreeshipping {
def main(args: Array[String]): Unit={
  /*
  12)Eligibility for Discount OR Free Shipping:
Create a Scala program to check if a customer is eligible for a discount (purchase amount greater
than 150) or qualifies for free shipping (purchase amount greater than 100).
Sample Data:
Purchase Amount: 120
   */
var pamount=120
  if(pamount>150){
    println("Customer is eligible for discount")
  }
  else if(pamount>100){
    println("customer qualifies for free shipping")
  }

}
}
