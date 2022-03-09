class customClass<T> {
    fun<T> customfunc(stringPar: T) {
        println(stringPar)
    }
}

fun main() {
    val obj = customClass<Double>()
    obj.customfunc("Generics are fun")
}
