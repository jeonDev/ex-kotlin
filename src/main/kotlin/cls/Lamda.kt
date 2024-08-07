fun main() {
    b(::a) // 함수를 넘겨줄 때 ::

    // 람다 함수로 작성된 c
    // (입력 타입) -> 반환 타입 = {변수이름 : 입력타입 -> 구문}
    // 아래 두개의 c, d처럼 타입 생략 가능
    var c : (String) -> Unit = {s -> println(s) }
    c("zxc")

    var d = {s : String -> println(s) }
    d("sss")

    var e = {s : String -> s}
    println( e("abc") )
    var f = { println("xzcxc") }
    f()
    var g : (String) -> Unit = { println(it) }
    g("q")


}

fun a (str : String) : String {
    return str
}

fun b (funs: (String) -> String) {
    println(funs("awds"))
}