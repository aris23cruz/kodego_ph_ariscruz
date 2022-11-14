package assignments

fun main(){
//Implement Activity 01 - C using data structure.

    println("***Grocery Inventory***")
    val category = mapOf(1 to "Can Goods",2 to "Beverages",3 to "Meat",4 to "Dry Goods",5 to "EXIT")
    val inventory = mutableMapOf<Int,String>()
    val mainMenu = mapOf(1 to "Add to Inventory",2 to "Remove from Inventory",3 to "EXIT" )

    while (true){
        //Main Menu
        println("Main Menu")
        for (value in mainMenu.entries){
            println(value)
        }
        println("**************")
        val inputMenu: Int = readln().toInt()
        if (inputMenu == 1){
            println("Add to Inventory")
            println("***************")
            println("Please select category")
            for (value in category.entries){
                println(value)
            }
            println("***************")
            val inputInventory: Int = readln().toInt()
            if (inputInventory == 1){
                println("Input the quantity")
                val input = readln().toInt()
                inventory.put(input,"Can Goods")
                println("You add $input item/s to Can Goods")
                for (quantity in inventory.entries){
                    println(quantity)
                }
            }else if (inputInventory == 2){
                println("Input the quantity")
                val input = readln().toInt()
                inventory.put(input,"Beverages")
                println("You add $input item/s to Beverages")
                for (quantity in inventory.entries){
                    println(quantity)
                }
            }else if (inputInventory == 3){
                println("Input the quantity")
                val input = readln().toInt()
                inventory.put(input,"Meat")
                println("You add $input item/s to Meat")
                for (quantity in inventory.entries){
                    println(quantity)
                }
            }else if (inputInventory == 4){
                println("Input the quantity")
                val input = readln().toInt()
                inventory.put(input,"Dry Goods")
                println("You add $input item/s to Dry Goods")
                for (quantity in inventory.entries){
                    println(quantity)
                }
            }else if (inputInventory == 5){
                println("Done")
                break
            }
        }else if(inputMenu == 2){
            println("Remove from Inventory")
            println("***************")
            println("Please select category")
            for (value in category.entries){
                println(value)
            }
            println("***************")
            val inputInventory: Int = readln().toInt()
            if (inputInventory == 1){
                println("Quantity remove")
                val input = readln().toInt()
                inventory.remove(input,"Can Goods")
                println("You remove $input item/s to Can Goods")
                for (quantity in inventory.entries){
                    println(quantity)
                }
            }else if (inputInventory == 2){
                println("Quantity Remove")
                val input = readln().toInt()
                inventory.remove(input,"Beverages")
                println("You remove $input item/s to Beverages")
                for (quantity in inventory.entries){
                    println(quantity)
                }
            }else if (inputInventory == 3){
                println("Quantity Remove")
                val input = readln().toInt()
                inventory.remove(input,"Meat")
                println("You remove $input item/s to Meat")
                for (quantity in inventory.entries){
                    println(quantity)
                }
            }else if (inputInventory == 4){
                println("Quantity")
                val input = readln().toInt()
                inventory.remove(input,"Dry Goods")
                println("You remove $input item/s to Dry Goods")
                for (quantity in inventory.entries){
                    println(quantity)
                }
            }else if (inputInventory == 5){
                println("Done")
                break
            }
        }else if (inputMenu == 3){
            println("--DONE--")
            break
        }

    }
}