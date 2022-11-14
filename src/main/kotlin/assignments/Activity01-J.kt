package assignments
//Using Activity 01 - C
//Implement a process where items are added to the grocery cart.
//User : Cashier
//Goal : List of Items bought, how many items were bought and total cost.
//Scope : Data Structures
fun main(){
    println("***Inventory System***")
    //conditions
    while (true) {
        do {
            println("Select Category:\n[1]Can Goods\n[2]Beverages\n[3]Meat\n[4]Dry Goods")
            val select: Int = readln().toInt()
            when {
                (select == 1) -> println("Add to Can Goods:")
                (select == 2) -> println("Add to Beverages:")
                (select == 3) -> println("Add to Meat:")
                (select == 4) -> println("Add to Dry Goods:")
                else -> println("Please Select a Category")
            }
            var addItems: String = readLine().toString()
            println("Item Added: $addItems")
            addItems += addItems
            println("Do You Want to Add another Item?[Y/N]")
            val addItem2: String = readln().uppercase()
        } while (addItem2 == "Y")
        println("Exiting...")
        break
    }

}