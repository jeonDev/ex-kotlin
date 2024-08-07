package variable
//https://cjw-awdsd.tistory.com/20
fun main(args: Array<String>) {

    variable()
    println(add(1, 2, 3))
    etcIf(10)
    etcIf(5)
    etcCompare(1)
    etcCompare("23")
    etcCompare({1})
    etcWhen(1)
    etcWhen("a")
    etcWhen("we")
    etcWhile()
    etcFor()
    etcFlow()
    etcLabel()
}
// variable
fun variable() {
    // 변수
    var intValA : Int = 10
    var intValB : Int
    intValB = 10
    var intValC: Int? = null
    println(intValA)
    println(intValB)
    println(intValC)
    // 형변환
    var a: Int = 123
    var b: String = a.toString()
    println(b)
    // 배열
    var intArr:Array<Int> = arrayOf(1,2,3,4)
    var intArr2 = arrayOfNulls<Int>(5)
    var anyArr: Array<Any> = arrayOf(1, "awd", 3.2, 4)
    println(intArr[0])
    println(intArr2[0])
    println(anyArr[0])
}

// function
fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

fun etcIf(a: Int) {
    if (a > 6) {
        println(a)
    } else {
        println("No");
    }
}

fun etcCompare(a: Any) {

    if (a is Int) {
        println("Int")
    } else if (a is String) {
        println("String")
    } else {
        println("Etc")
    }
}

fun etcWhen(a:Any) {
    when (a) {
        1 -> println(1)
        "a" -> println("a")
        else -> println("else")
    }
}

/*
fun etcWhile (a:Int) {
    while (a < 3) {
        println(a)
        a++
    }
}*/
fun etcWhile() {
    var a:Int = 0;
    while (a < 3) {
        println(a)
        a++
    }
}
fun etcFor() {
    var a: Int = 0;

    for (a in 0..3) {
        print(a)
    }
    println()
    for (a in 3 downTo  0) {
        print(a)
    }
    println()
    for (a in 0..5 step 2) {
        print(a)
    }
    println()
    for (a in 'a'..'e') {
        print(a)
    }
}

fun etcFlow() {
    for (i in 0..5) {
        if (i == 2) {
            break
        }
        println(i)
    }

    for (i in 0..5) {
        if (i == 2) {
            continue
        }
        println(i)
    }
}

fun etcLabel() {
    // @label : 반복문에 라벨이름@을 달고 break, continue 문에 @라벨 이름을 달면 break, continue가 라벨 이름으로 가 실행
    awd@for (i in 0..10) {
        for (j in 0..10) {
            if ( i == 0 && j == 3) {
                break@awd
            }
            println("$i, $j")
        }
    }
}