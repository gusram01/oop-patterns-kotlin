package observer

class Table(): Observer<Int> {

    override fun update(value: Int) {
        println("Table updated $value")
    }

}