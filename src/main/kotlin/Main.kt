fun main() {
    val cap=capitalize("kotlin is fun and i like it")
    println(cap)

    var takes = takesInString(listOf("mangoes","chairs","love","enemies"))
    println(takes)

    var product = listOfIntegers(listOf(4,8,2,6,7))
    println(product)
    var rev =reverse(listOf("beayty","laptop","phones","calculate"))
    println(rev)
    var max =findMax(listOf(3,8,10,6,20,18,5))
    println(max)
}
//capitalize the first letter of each word in a string and returns it
fun capitalize(name:String):String{
    val nam = mutableListOf<String>()
    name.split(" ").forEach { nam.add(it[0].uppercase()+ it.substring(1))
    }
    return nam.joinToString(" ")
}
//Write a function that takes in a list of strings and returns a new list
// that contains only the strings that have more than 5 characters.
fun takesInString(words:List<String>):List<String>{
    return words.filter { it.length >5}

}
//Write a function that takes in a list of integers and returns
// the product of all the numbers in the list.
fun listOfIntegers(numbers:List<Int>):Int{
    var sum =0
    for (num in numbers){
        sum += num*num
    }
    return sum

}
//Write a function that takes in a list of strings and
// returns a new list that contains the same strings, but in reverse order.

fun reverse(words: List<String>):List <String>{
    return words.reversed()
}
//Write a function that takes in a list of integers and returns the maximum value in the list.
    fun findMax(lst: List<Int>): Int {
        var maxVal = lst[0]
        for (i in 1 until lst.size) {
            if (lst[i] > maxVal) {
                maxVal = lst[i]
            }
        }
        return maxVal
    }



