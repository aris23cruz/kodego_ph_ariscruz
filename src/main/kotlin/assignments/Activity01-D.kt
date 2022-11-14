package assignments
fun main() {
    //Activity01-D
    var amount: Double = 0.0
    var answer: String = ""
    var divisor: Int = 0
    var total: Double = 0.0
    var input: Int = 0
//Activity 01-D
    try {
        do {
            print("Enter Amount:")
            input = readln().toInt()
            amount += input

            print("Do you want to add another amount?(yes/no)")
            answer = readln().lowercase()
            if (answer.isEmpty()) {
                throw Exception()
            }
        } while (answer == "yes")

        println("Divide the value by how many?")
        divisor = readln().toInt()
        total = amount / divisor

        println("The result is $total")
    } catch (e: NumberFormatException) {
        println(e.message)
        println("Enter Digits Only")
    } catch (e: ArithmeticException) {
        println(e.message)
        println("Zero 0 is not valid")
    }
}