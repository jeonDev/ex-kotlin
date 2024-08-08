fun main() {
    var a = Book("book", 20000)
    // apply 스코프람다함수를 통해 a의 객체의 속성과 함수 변경 및 사용 가능
    a.apply {
        name = "apply $name"
        dc()
    }
    a.printName()

    // run
    var b = a.run {
        name = "apply $name"
        dc()
        "zxc"// 반환
    }
    println(b)
    a.printName()

    // with
    var c = with(a) {
        name = "apply $name"
        dc()
        "zxc"
    }
    println(c)
    a.printName()

    var price = 5000
    var d = SecondBook("a", 20000)
    d.run {
        // 20000원이 출력되어야 하지만, main 의 price가 스코프 우선순위가 높아 5000원 출력
        println(price)
    }
    d.let {
        println(price)
    }
}

// 함수형 언어를 좀 더 편리하게 사용할 수 있도록 하는 기본 함수
// apply, run, with, also, let

// apply
class Book (var name: String, var price: Int) {
    fun dc() {
        price -= 2000
    }

    fun printName() {
        println("$name $price")
    }
}

// run
// apply랑 똑같은 기능이지만 마지막 구문에 있는 값을 반환해주는 차이가 있음


// with
// run이랑 똑같지만 사용법만 다름

// let / also
// apply -> also | run -> let
// 기능은 위와 같다. 하지만, also, let의 공통된 차이점은 it키워드를 사용해 객체 변수를 참조한다는 것
// 이유는 같은 이름 변수로 혼동이 올 수 있기 때문
class SecondBook(var name:String, var price:Int) {

}