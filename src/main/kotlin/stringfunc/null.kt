package stringfunc

// 자바에서는 보통 if (변수==null) 형식으로 null 값을 처리한다.
// 코틀린은 ? ?: !! 을 통해 null 값을 처리할 수 있다.
fun main() {
    var a = listOf<String?> ("awd", null, "zxc")
    var c = mutableListOf<String>()
    var e = mutableListOf<String>()
    var f = mutableListOf<String>()

    for (b in a) {
        // b가 null이면 .let 구문을 실행하지 않는다.
        b?.let { c.add(it) }
        // b가 null이면 default 값이 대신 추가된다.
        e.add(b?:"default")
    }
    println(c)
    println(e)

    for (b in a) {
        // b가 null인 것을 의도적으로 방치 -> 오류 발생
        // !! null이 아님을 선언
        f.add(b!!)
    }
    println(f)
}