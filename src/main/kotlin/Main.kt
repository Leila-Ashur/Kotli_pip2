fun main() {
var detail=details("Leila",34,"Kenya")
    println(detail)
var long=length("AkiraChix")
    println(long)
    myDetail("Valary")
    var replace=replaceVowels("Phone")
}
//1. Write a function that takes in 3 parameters, name, age, and country, and returns a String with this structure
// “Hi, my name is x, I am y years old and I am from z.” Where x, y, and z are the provided name, age, and country
// respectively. (3 points)
fun details(name: String,age: Int,country:String) :String{
    return "Hi my name is $name Iam a $age years old and iam from $country "


}
// Write a function that takes in a String and returns its length
fun length(school:String):Int{
    return  school.length
}
//Write a function that takes in a name and prints out “That’s me!” when your name is
// passed to it, otherwise, it prints out “I don’t know who that is”
fun myDetail(name: String){
    if (name=="Leila"){
        println("Thats me")
    }
    else{
        println("I dont know who that is ")
    }

}
//Write a Kotlin function that takes in a string with all the vowels replaces by the character ‘*’.
// Use string interpolation to generate the output
fun replaceVowels(place:String):String{

        val vowels = setOf('a', 'e', 'i', 'o', 'u')
        var result = ""
        for (char in place) {
            if (char in vowels) {
                result += "*"
            } else {
                result += char
            }
        }
            return "$result and $place"
        }




