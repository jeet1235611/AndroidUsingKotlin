fun <T> customfunc(content: T) {
    println(content)
}
fun main() {
    val x = 3
    customfunc <Int> (7/x)
    customfunc<Int>(7/x)
}
