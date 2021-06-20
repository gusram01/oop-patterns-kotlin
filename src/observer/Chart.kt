package observer

class Chart(): Observer<Int> {

    override fun update(value: Int) {
        println("Chart updated $value")
    }
}