package assignments
import java.beans.Customizer
private var studentList = ArrayList<String>(20)
//Activity03-A
fun main() {
    val mainMenu = mapOf<Int,String>(1 to "Add Student Name",2 to "Remove Student", 3 to "Count Student",
    4 to "Make a Wild Search",5 to "Search Student Name",6 to "Search Student",
        7 to "Show Students",8 to "Student in Record",9 to "Exit" )

    println("***Student Directory***")

    while (true){
        println("***Main Menu***")
        for (value in mainMenu){
            println(value)
        }
        println("***************")
        val input = readln().toInt()
        if (input == 1){
            do {
                addStudent()
                println("Do you want to add another?[yes/no]")
                val answer = readln().lowercase()
            }while (answer == "yes")
        }else if (input == 2){
            do {
                removeStudent()
                println("Do you want to remove another?[yes/no]")
                val answer = readln().lowercase()
            }while (answer == "yes")
        }else if (input == 3){
            print(countStudent())
        }else if (input == 4){
            searchStudentWildSearch()
        }else if (input == 5){
            searchStudentName()
        }else if (input == 6){
            searchStudent()
        }else if (input == 7){
            showStudents()
        }else if (input == 8){
            isStudentInRecord()
        }else if (input == 9){
            println("Exiting...")
            break
        }
    }
    println("Thank you for using the App")
}
fun isStudentInRecord(){
    println("Enter Name:")
    val name = readln().uppercase()
    if (studentList.contains(name)){
        println("Name is in record")
    }else{
        println("Name not found")
    }
}
fun addStudent(){
    println("Enter Name:")
    studentList.add(readln().uppercase())
}
fun removeStudent(){
    println("Enter Name:")
    studentList.remove(readln().uppercase())
}
fun countStudent(){
    println("The number of student/s: ${studentList.size}")
}
fun searchStudentWildSearch(){
    println("Enter first 3 letters:")
    val inputName = readln().uppercase()
    val filterName : List<String> = studentList.filter { it.startsWith(inputName) }

    println("Here are the names:")
    for (value in filterName){
        println(value)
    }
}
fun searchStudentName() {
    println("Enter Exact Name:")
    val inputName = readln().uppercase()
    val filterName: List<String> = studentList.filter { it == inputName }

    println("Here are the names:")
    for (value in filterName){
        println(value)
    }
}
fun searchStudent(){
    println("Enter Name of Student:")
    val inputName = readln().uppercase()

    if (inputName.length <= 3){
        searchStudentWildSearch()
    }else{
        searchStudentName()
    }
}
fun showStudents(){
    println("List of Students:")
    for (names in studentList){
        println(names)
    }
}