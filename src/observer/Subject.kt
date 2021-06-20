package observer

abstract class Subject {
    private var observers: ArrayList<Observer<Int>> = ArrayList()

    fun addObserver(observer: Observer<Int>){
        this.observers.add(observer)
    }

    fun removeObserver(observer: Observer<Int>) {
        this.observers.remove(observer)
    }

    fun notifyObservers(value: Int) {
        this.observers.forEach { observer -> observer.update(value) }
    }
}