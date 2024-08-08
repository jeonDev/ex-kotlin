package etc

fun main() {
    println("awd" strSum 1)
    println("awd".strSum(2))

    println(3 mul 4)
    println(3.mul(4))
}

// infix fun (this에 해당되는 타입).함수이름(인자이름: 타임): 반환 = 구문
infix fun String.strSum(x: Int) : String = this + x
infix fun Int.mul(x: Int) :Int = this * x

// 참고 : 클래스안에 infix 함수를 적용할 경우 this는 클래스 객체 자신이므로 함수이름 왼쪽에 클래스 이름은 쓰지 않는다.
