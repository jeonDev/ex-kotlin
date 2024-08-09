package etc
// 변수의 초기화 시점을 사용할 때 초기화하게 해주는 키워드
fun main() {
    val num : Int by lazy {
        println("초기화")
        7
    }
    println("start")
    println(num)
    println(num)
}