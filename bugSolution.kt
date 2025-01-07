fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val listCopy = list.toMutableList()
    list.removeAll(listCopy.filter { it % 2 == 0 })
    println(list)
}