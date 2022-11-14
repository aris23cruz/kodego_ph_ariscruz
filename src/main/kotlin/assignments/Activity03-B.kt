package assignments
//Activity 03-B
private var listOfBooks = ArrayList<String>(20)
fun main(){
    val mainMenu = mapOf<Int,String>(1 to "Add Book",2 to "Remove Book",3 to "Count Book",
    4 to "Book In Record",5 to "Wild Search",6 to "Search Book Title",7 to "Available Book Title",8 to "EXIT")

    println("*** e-LIBRARY ***")
    while (true){
        println("*-* Main Menu *-*")
        for (options in mainMenu){
            println(options)
        }
        println("*-*-*-*-*-*-*-*-*-*")
        val inputOptions = readln().toInt()
        if (inputOptions == 1){
            do {
                addBook()
                println("Do you want to add another?[yes/no]")
                val answer = readln().lowercase()
            }while (answer == "yes")
        }else if (inputOptions == 2){
            do {
                removeBook()
                println("Do you want to remove another?[yes/no]")
                val answer = readln().lowercase()
            }while (answer == "yes")
        }else if (inputOptions == 3){
            countBook()
        }else if (inputOptions == 4){
            isBookInRecord()
        }else if (inputOptions == 5){
            searchBookWildSearch()
        }else if (inputOptions == 6){
            searchBookName()
        }else if (inputOptions == 7){
            showBooks()
        }else{
            println("Exiting")
            break
        }
    }
    println("Thank you for using the app")
}
fun isBookInRecord(){
    println("Enter Book Title:")
    val title = readln().uppercase()
    if (listOfBooks.contains(title)){
        println("Book is in record")
    }else{
        println("Book not found")
    }
}
fun addBook(){
    println("Enter Book Title:")
    listOfBooks.add(readln().uppercase())
}
fun removeBook(){
    println("Enter Book Title:")
    listOfBooks.remove(readln().uppercase())
}
fun countBook(){
    println("The number of book/s: ${listOfBooks.size}")
}
fun searchBookWildSearch(){
    println("Enter first 3 letters:")
    val inputTitle = readln().uppercase()
    val filterTitle : List<String> = listOfBooks.filter { it.startsWith(inputTitle) }

    println("Here are the titles:")
    for (value in filterTitle){
        println(value)
    }
}
fun searchBookName(){
    println("Enter Exact Title:")
    val inputTitle = readln().uppercase()
    val filterTitle: List<String> = listOfBooks.filter { it == inputTitle }

    println("Here are the titles:")
    for (value in filterTitle){
        println(value)
    }
}
fun showBooks(){
    println("List of Books:")
    for (books in listOfBooks){
        println(books)
    }
}