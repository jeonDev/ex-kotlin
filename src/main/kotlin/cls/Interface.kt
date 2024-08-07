fun main() {
    var a = DogImpl(1)
    a.eat()
    a.run()
}

interface Runner {
    fun run()
}
interface Eater {
    fun eat() {
        println("awd")
    }
}

class DogImpl (var a : Int) : Runner, Eater {
    override fun run() {
        println("Hi")
    }
}

/**
 코틀린에서 인터페이스는 자바 인터페이스와 다르게
  추상 함수만 있는게 아니라 속성과 일반 함수도 선언 할 수 있다.
  하지만, 생성자는 생성할 수 없다.
  구현부가 있는 함수 -> open 함수로 간주
  구현부가 없는 함수 -> abstract 함수로 간주
 * */