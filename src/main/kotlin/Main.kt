import item2.prime
import kotlin.concurrent.thread
import kotlin.properties.Delegates

var name : String = "yjin"
var surname : String = "kim"

var fullName
get() = "$name $surname"
set(value) {}

inline fun<T, R> Iterable<T>.map(
    transformation: (T) -> R
) : List<R> {
    val list = ArrayList<R>()
    for(elem in this) {
        list.add(transformation(elem))
    }

    return list
}

fun main() {
//    val userHolder = UserHolder()
//    // userHolderMap은 return을 mutableMap의 superclass(Map)로 받기때문에, 수정은 불가하다.
//    // 이런식으로 가변성을 제한 할 수도 있다.
//    val userHolderMap = userHolder.loadAll()




//    var list1 : List<Int> = listOf()
//    println(list1)
//    list1+=1
//    println(list1)
//    list1+=1
//    println(list1)
    // [1, 1]

//    val list2 : MutableList<Int> = mutableListOf()
//    println(list2)
//    list2.add(1)
//    println(list2)
//    list2.add(1)
//    println(list2)
    // [1, 1]

    //최악의 방식
    // 변경 가능한 두 지점을 위해서 동기화를 구현해놔야한다....
    var list3 = mutableListOf<Int>()

    // 가변성을 최대한 제한하는것이 좋다.


//    var names by Delegates.observable(listOf<String>()) {
//        _,old,new -> println("Names changed from $old to $new")
//    }
//    println(names)
//    names += "Fabio"
    //println(names)



    // wrong example -> should use mutableList
//    val wronglistexample = listOf(1,2,3)
//    if (wronglistexample is MutableList) {
//        // this is downcasting, kotlin doesnt want to do.
//        // error = UnsupportedOperationException
//        //wronglistexample.add(11)
//    }
//    //println(wronglistexample)
//
//    val rightlistexample = listOf(1,2,3)
//    val rightmutableslist = rightlistexample.toMutableList()
//
//    if(rightmutableslist is MutableList) {
//        rightmutableslist.add(123)
//    }
//    println(rightmutableslist)
//
//
//
//
//    val colors = listOf("red","brown","grey")
//    val animals = listOf("fox","bear","wolf")
//
//    val list = colors.zip(animals) {
//        colors, animal -> "${animal.replaceFirstChar { it.uppercase() }} is $colors"
//    }
//
//    val numberPairs = listOf("one" to 1, "two" to 2)
//    val unzipNumberPairs = numberPairs.unzip()
//    println(unzipNumberPairs)

    val p = prime()
    p.eratosthenes()
    println()
    p.betterEratosthenes()



}

// 값이 자주 바뀌는 좋지 않은 코드
//fun main(args: Array<String>) {
//
//
//    var num = 0
//    for(i in 1..1000) {
//        thread {
//            Thread.sleep(10)
//            num += 1
//        }
//    }
//
//    Thread.sleep(5000)
//    print(num)
//}

//suspend fun main() {
//    val lock = Any()
//    var num = 0
//
//    for (i in 1..1000) {
//        thread {
//            Thread.sleep(10)
//            synchronized(lock) {
//                num+=1
//            }
//        }
//    }
//
//    Thread.sleep(1000)
//    print(num)
//}
