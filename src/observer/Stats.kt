package observer

class Stats : Subject() {
    var value = 0
        set(newVal){
            field = newVal
            notifyObservers(newVal)
        }


}