import pattern.EventPrinter

// 옵저버(Observer) 패턴
// listener, callback 이라고 부른다.
// 간단히 말하면 어떠한 이벤트가 발생을 감시해 이벤트 발생 시 기능이 호출되도록 하는 패턴
fun main () {
    EventPrinter().start()
}

