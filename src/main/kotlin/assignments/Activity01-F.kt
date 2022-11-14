package assignments
//Create an application that will accept 2 string inputs.
//Your application will print all unique characters in both Strings.
fun main(){

    println("Enter Your 1st Word")
    var word1: String = readln()
    println("Enter Your 2nd  Word")
    var word2: String = readln()

    var combine: String = ""


    for (unique1 in word1.indices){
        for (element in word2) {
            if (word1[unique1] == element){
                combine += word1[unique1]
            }
        }
    }

    for (element in combine){
        var remove = element + ""
        word1 = word1.replace(remove,"")
        word2 = word2.replace(remove,"")
    }
    println("The unique character for 1st word $word1")
    println("The unique character for 2nd word $word2")
}