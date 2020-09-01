fun main() {
    val ranges = 1.rangeTo(10) step 3
    for (i in ranges ){
        println("value is $i!")
    }
    ranges.forEachIndexed { index, value ->
        println("value $value with index $index")
    }
    ranges.forEachIndexed { index, _ ->
        println("index $index")
    }
}
