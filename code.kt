class customClass<T: Any?> {
    fun customfunc(stringPar: Any?) {
        println(stringPar)
    }
}

fun main() {
    val string: Any = "null"
    val obj = customClass<Any>()
    obj.customfunc(string)
}
