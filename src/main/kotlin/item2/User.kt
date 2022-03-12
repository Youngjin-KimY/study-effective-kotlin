package item2

class User (username : String){
    val username : String = username

    override fun toString(): String {
        return "username is " + username
    }
}

class Useruse {
    val users = mutableListOf<User>()

    constructor(){
        users.add(User("hanna"))
        users.add(User("yjkim"))
    }


    fun bad() {
        fun fizz() {

            // user variable can be modified outside of for statment
            var user: User
            for(i in users.indices) {
                user = users[i]
                println("User at $i is $user")
            }
        }

        fizz()
    }

    fun littleBetter() {
        println("---------------------------------------------------from littleBetterCode")
        fun fizz() {
            for(i in users.indices) {
                val user = users[i]
                println("User at $i is $user")
            }
        }

        fizz()
    }

    fun best() {
        println("---------------------------------------------------from best")
        fun fizz() {
            for((i, user) in users.withIndex()) {
                println("User at $i is $user")
            }
        }

        fizz()
    }
}