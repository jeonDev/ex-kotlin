fun main() {
    var dog = Dog("Anna", 10)
    dog.introduce()
    dog.dogIntroduce()
}

open class Animal (var name:String, var age:Int, var type:String) {
    open fun introduce() {
        println("${this.name} ${this.age} ${this.type}")
    }
}

class Dog(var dogName: String, var dogAge: Int) : Animal(dogName, dogAge, "강아지") {
    fun dogIntroduce() {
        super.introduce()
    }

    override fun introduce() {
        println("override")
    }
}

/**
 클래스를 상속할 때 부모 클래스는 open 이라는 키워드가 있어야 상속이 가능하다.
 또한 서브 클래스의 속성들은 부모 클래스의 속성과 이름이 같으면 안된다.
 함수를 override 할 때는 override 키워드 사용
 함수를 override 할 때도 부모 클래스의 함수에 open 키워드를 사용해야 함
 */