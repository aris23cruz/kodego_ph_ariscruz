package assignments
//Activity 03-C
private var cart = HashMap<String,Int>(20)
fun main(){
    val mainMenu = mapOf<Int,String>(1 to "Add to Cart",2 to "Remove from Cart",3 to "Check Out",
                                        4 to "EXIT")

    while (true){
        println("*-*-*MAIN MENU*-*-*")
        for (options in mainMenu){
            println(options)
        }
        println("*-*-*-*-*-*-*-*-*-*")
        val inputOption = readln().toInt()
        if (inputOption == 1){
           do {
               addToCart()
               println("Do you want to add another?:[yes/no]")
               val answer = readln().lowercase()
           }while (answer == "yes")
           println("You have the following:")
            for (grocery in cart){
                println(grocery)
            }
        }else if (inputOption == 2){
            do {
                removeFromCart()
                println("Remove another item?:[yes/no]")
                val answer = readln().lowercase()
            }while (answer == "yes")
            println("You now have the following")
            for (grocery in cart){
                println(grocery)
            }
        }else if (inputOption == 3){
            checkOut()
        }else if (inputOption == 4){
            println("Exiting...")
            println("Thank you for shopping!")
            break
        }
    }

}
fun addToCart(){
    println("Enter Item:")
    val item = readln()
    println("Enter Quantity")
    val quantity = readln().toInt()
    cart[item] = quantity
}
fun checkOut(){
    println("Items on your cart:")
    for (items in cart.entries){
        println(items)
    }
    println("Total Items on cart: ${cart.count()}")
    println("Thank you for shopping!")
    println("Please type 4 to EXIT")
}
fun removeFromCart(){
    println("Remove item/s:")
    val item = readln()
    println("Remove quantity")
    val quantity = readln().toInt()
    cart.remove(item,quantity)
}