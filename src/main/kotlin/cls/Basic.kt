fun main() {
    var a = Prs("jhjeon", 23);
    a.introduce()
    println("${a.birth} ${a.name}")

    var b = Prs("jhjeon");
}

// 자바와 다르게 생성자를 따로 만들어 주지 않아도 된다.
// 객체를 생성할 때 속성 따라 값을 입력해주면 된다.
class Prs(var name:String, val birth:Int) {

    // 보통 자바에서는 생성자를 만들면 구문을 수행하는 기능을 넣을 수 있다.
    // 하지만 생성자를 만들면 생성자를 실행하면서 구문을 넣을 수 없었다.
    // init을 사용하여 생성자를 출력했을 시 구문이 실행되게 할 수 있다.
    // init은 여러개 둘 수 있다.
    init {
        println("${this.name} ${this.birth}")
    }

    // 오버로딩 생성자
    constructor(name: String): this(name, 20)

    fun introduce() {
        println("$name $birth")
    }
}