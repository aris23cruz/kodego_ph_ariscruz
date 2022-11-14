package assignments

fun main(){
//Implement Activity 01 -  B using data structure.

    println("***E-Library***")
    val menu = mapOf(1 to "Barrow",2 to "Return",3 to "Exit")
    val barrow = mutableMapOf(100 to "Generalities",200 to "Philosophy",300 to "Literature",400 to "Technology")
    while (true){
        println("Choose the number to start")
        for (option in menu.entries){
            println(option)
        }
        println("****************")
        val choice = readln().toInt()
        if (choice == 1){
            println("Choose your Book Code")
            for (choice2 in barrow.entries)
                println(choice2)
            println("****************")
            val books = readln().toInt()
            //Conditions
            when (books) {
                100 -> { barrow.remove(100)
                    println("Generalities") }
                200 -> { barrow.remove(200)
                    println("Philosophy") }
                300 -> { barrow.remove(300)
                    println("Literature") }
                400 -> { barrow.remove(400)
                    println("Technology") }
                else -> {
                    println("Book not available") }
            }
            println("Available Books")
            for (available in barrow.entries){
                println(available)}
            println("Please return after 3 Days")
        }else if (choice == 2){
            println("Enter the Book Code:")
            val book2 = readln().toInt()
            when (book2){
                100 -> { barrow.put(100,"Generalities")
                    println("Generalities") }
                200 -> { barrow.put(200,"Philosophy")
                    println("Philosophy") }
                300 -> { barrow.put(300,"Literature")
                    println("Literature") }
                400 -> { barrow.put(400,"Technology")
                    println("Technology") }
                else -> {
                    println("Book not available") }
            }
            println("Available Books:")
            for (choice3 in barrow.entries) {
                println(choice3)
            }
            println("Thank You for returning on time")
        }else if(choice == 3){
            println("Thank you for your visit")
            break
        }
        println("***************")
    }

}