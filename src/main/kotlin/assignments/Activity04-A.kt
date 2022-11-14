package assignments
//Activity04-A

fun main(){
    val student = StudentInfo("Cruz","Aristotle","Aris",93106332,2022)
    val addSearch = mapOf<Int,String>(1 to "Add Student",2 to "Make A Wild Search", 3 to "EXIT")
   while (true){
       println("***OPTIONS***")
       for (value in addSearch){
           println(value)
       }
       println("*************")
       val option = readln().toInt()
       if (option == 1){
           do {
               student.addStudent()
               println("Do you want to add another?[yes/no]")
               val answer = readln().lowercase()
           }while (answer == "yes")
       }else if (option == 2){
           do{
               println("Search for Student Name")
               val searchName = mapOf<Int,String>(1 to "First Name", 2 to "Last Name",3 to "Nick Name",4 to "Back to Main")
               println("***OPTIONS***")
               for (value in searchName){
                   println(value)
               }
               println("*************")
               when (readln().toInt()) {
                   1 -> {
                       student.searchStudentWildSearchFirst()
                   }
                   2 -> {
                       student.searchStudentWildSearchLast()
                   }
                   3 -> {
                       student.searchStudentWildSearchNick()
                   }
                   4 -> {
                       println("Please type NO")
                   }
               }
               println("Do you want to search for another?[yes/no]")
               val answer = readln().lowercase()
           }while (answer == "yes")
       }else{
           println("Thank you for using the app")
           break
       }
   }

}
class StudentInfo(var lastName: String,var firstName: String,var nickName: String,var id: Int,
                  var yearEnrolled: Int) {
    private var studentLastName = ArrayList<String>(20)
    private var studentFirstName = ArrayList<String>(20)
    private var studentNickName = ArrayList<String>(20)
    init {
        println("Student Info Search")
    }

    fun searchStudentWildSearchLast(){
        println("Enter first 3 letters:")
        val inputName = readln().uppercase()
        val filterName : List<String> = studentLastName.filter { it.startsWith(inputName) }

        println("Here are the names:")
        for (value in filterName){
            println(value)
        }
    }
    fun searchStudentWildSearchFirst(){
        println("Enter first 3 letters:")
        val inputName = readln().uppercase()
        val filterName : List<String> = studentFirstName.filter { it.startsWith(inputName) }

        println("Here are the names:")
        for (value in filterName){
            println(value)
        }
    }
    fun searchStudentWildSearchNick(){
        println("Enter first 3 letters:")
        val inputName = readln().uppercase()
        val filterName : List<String> = studentNickName.filter { it.startsWith(inputName) }

        println("Here are the names:")
        for (value in filterName){
            println(value)
        }
    }
    fun addStudent(){
        println("Enter Last Name:")
        lastName = readln().uppercase()
        println("Enter First Name:")
        firstName = readln().uppercase()
        println("Enter Nick Name:")
        nickName = readln().uppercase()
        studentLastName.add(lastName)
        studentFirstName.add(firstName)
        studentNickName.add(nickName)
    }
}

