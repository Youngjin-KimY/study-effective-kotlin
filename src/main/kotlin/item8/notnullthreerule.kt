package item8

class notnullthreerule {
    companion object {
        val PI = 3.14
    }
    fun process(user : User) {
        requireNotNull(user.name);
        val context = checkNotNull(user.address)
        val processingNickname = user.nickname ?:
        throw NullPointerException()

        println("pass all nullchecking")
    }
}

class User (){
//    lateinit var name : String
//    lateinit var address : String
//    lateinit var nickname : String
    var name : String? = ""
    get() {
        return field
    }
    set(value) {
        field = value
    }
    val address : String? = ""
    val nickname : String? = ""
}