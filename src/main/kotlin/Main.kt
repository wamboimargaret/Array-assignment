fun main(){
list()
caps()
    maths()
    var x =( names("book","pen","Ink"))
    println(x)
    println( names("book","pen","Ink"))


}
//Question One//
fun list(){
    var friends= arrayOf("vicy","flo","henry","lilian")
    println(friends.contentToString())
}
//Question two//
fun caps(){
    var cities = arrayOf("harare","mumbai", "dodoma","jakata")
    println(cities.map {it.capitalize()})
}
//Question three//
fun maths(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers[1]+numbers[4]
    println(sum)

    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}
//Question four//
fun names (name:String,name2:String,name3:String) :String{
var myArray = arrayOf(name,name2,name3)
    return myArray.contentToString()
}


