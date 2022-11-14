package assignments
//Create an application that will accept 2 Integers.
//It will identify the lower value and bigger value of the two inputs.
//Then, your application will print all the prime numbers
// starting from the lower number up to the largest number.
fun main(){
    //to determine the lowest or bigger value number
    println("Enter your lower value Number")
    var num1: Int = readln().toInt()
    println("Enter your bigger value Number")
    var num2: Int = readln().toInt()


    //to print the list of prime numbers in a given range.
    while (num1 < num2) {
        if (checkPrimeNumber(num1)) {
            print("$num1 ")
        }

        num1++
    }
}
//function to check a prime number
fun checkPrimeNumber(num: Int): Boolean {
    var flag = true
    for (i in 2..num / 2) {
        if (num % i == 0) {
            flag = false
            break
        }
    }
    return flag
}