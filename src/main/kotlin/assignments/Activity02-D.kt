package assignments
//Implement Activity 01 - D using data structure.
fun main(){
    val monetaryAmount = ArrayList<Int>()
   do {
       println("Please enter five(5) amount")
       print("Enter Amount1:")
       monetaryAmount.add(readln().toInt())
       print("Enter Amount2:")
       monetaryAmount.add(readln().toInt())
       print("Enter Amount3:")
       monetaryAmount.add(readln().toInt())
       print("Enter Amount4:")
       monetaryAmount.add(readln().toInt())
       print("Enter Amount5:")
       monetaryAmount.add(readln().toInt())
       println("You had enter:")
       for (value in monetaryAmount) {
           println( "$value" )
       }
           println("Divide the value by how many?")
           val divisor : Int = readln().toInt()
           val total = monetaryAmount.sum()/divisor
           println("The result is $total")
           break
   }while (true)

}
