package iterator

class BrowserHistory {
    private val urls = ArrayList<String>()

    fun push(url: String){
        urls.add(url)
    }

    fun pop(): String {
        val lastItem = urls.last()
        urls.remove(lastItem)

        return lastItem
    }

    fun createIterator(): Iterator<String>{
        return ListIterator(this)
    }

    class ListIterator(private var history: BrowserHistory): Iterator<String> {
        private var index: Int = 0

        override fun next() {
            index += 1
        }

        override fun current(): String {
            return history.urls[index]
        }

        override fun hasNext(): Boolean {
            return (index < history.urls.size)
        }

    }
}