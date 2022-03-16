package item10

class item10test {
    fun fib(n : Int) : Int {
        when(n) {
            0, 1 ,2 -> return 1
            else -> return fib(n-1) + fib(n-2)
        }
    }
}