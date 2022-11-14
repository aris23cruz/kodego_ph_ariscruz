package assignments
//Using Activity 01 - B, Implement a process where someone can borrow a book.
//User: Librarian
//Goal: Keep track book borrowed, who borrowed and how long it can be borrowed.
fun main() {
    println("***E-Library***")
    //borrowers' details
    println("***Fill out the form***")
    println("Enter your Name:")
    val inputName: String = readln()
    println(inputName)
    println("Date Borrowed[dd/mm/yy]:")
    val inputDate: String = readln()
    println(inputDate)
    //Main menu
    println("Enter Book Code")
    val deweyDecimal = readln().toDouble()
    //Conditions
    if ((deweyDecimal >= 100) && (deweyDecimal <= 199)) {
        println("Generalities")
    } else if ((deweyDecimal >= 200) && (deweyDecimal <= 299)) {
        println("Philosophy")
    } else if ((deweyDecimal >= 300) && (deweyDecimal <= 399)) {
        println("Literature")
    } else if ((deweyDecimal >= 400) && (deweyDecimal <= 499)) {
        println("Technology")
    } else {
        println("Invalid Input")
    }
    println("Date Return[dd/mm/yy]:")
    val inputDate2: String = readln()
    println(inputDate2)

    println("Thank you! Please return it on time.")
}