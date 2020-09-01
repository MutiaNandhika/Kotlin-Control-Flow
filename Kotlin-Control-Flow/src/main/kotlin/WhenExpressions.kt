fun main() {
    val umur = 16
    val ranges = 0..5
    val ranges2 = 6..11
    val ranges3 = 12..16
    val ranges4 = 17..25
    val ranges5 = 26..35
    val ranges6 = 36..45

    when(umur){
        in ranges -> println("Masa Balita")
        in ranges2 -> println("Masa Kanak-kanak")
        in ranges3 -> println("Masa Remaja Awal")
        in ranges4 -> println("Masa Remaja Akhir")
        in ranges5 -> println("Masa Dewasa Awal")
        in ranges6 -> println("Masa Dewasa Akhir")
        !in ranges -> println("Lansia")
        else -> println("Tidak terdeteksi")
    }

    val anyType: Any = 100L
    when (anyType) {
        is Long -> println("the value has a Long type")
        is Int -> println("the value has a Int type")
        is Double -> println("the value has a Double type")
        else -> println("undefined")
    }

}