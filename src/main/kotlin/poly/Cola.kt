package poly

class Cola: Drink() {
    var type = "콜라"
    override fun drink() {
        println("${type}을 마십니다")
    }
    fun washD() {
       println("${type}으로 설거지 합니다")
    }
}