package item5

class test {
    fun requiretest(v : Int) {
        require(v >= 10)
        println("hello")
    }

    fun factorial(n : Int) : Long {
        require(n >= 0) {
            "Cannot calculate factorial of $n " +
                    "because it is smaller than 0"
        }
        return if(n <= 1) 1 else factorial(n - 1) * n
    }

    fun checktest(s : String?) {
        val email = requireNotNull(s)
        println("pass check")
    }

    fun sendEmail(person: person, text: String) {
        val email: String = person.email ?: return

        println("hi")
    }
}