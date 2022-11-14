package assignments
//Create an application that will accept 1 string.
//Your application will print “Palindrome” if the string is a palindrome.
fun main(){
    println("Enter a Word:")
    var word1: String = readln().toString()
    var word2 = word1.reversed()
    //to check if the word is a palindrome
    if (word2 == word1){
        println("$word1 is a Palindrome")
    }else{
        println("$word1 is not a Palindrome")
    }
}