package observer

fun main() {
    val myStat = Stats()
    val table1 = Table()
    val table2 = Table()
    val chart1 = Chart()

    myStat.addObserver(table1)
    myStat.addObserver(table2)
    myStat.addObserver(chart1)

    myStat.value = 3
    myStat.value = 4
    myStat.value = 5
    myStat.value = 6
}