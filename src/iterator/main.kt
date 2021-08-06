package iterator

fun main() {
    val history = BrowserHistory()

    history.push("url1")
    history.push("url2")
    history.push("url3")
    history.push("url4")

    val historyIterator = history.createIterator()

    while (historyIterator.hasNext()){
        println(historyIterator.current())
        historyIterator.next()
    }
}