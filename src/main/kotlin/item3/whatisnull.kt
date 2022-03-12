//package item3
//
//class whatisnull {
//    fun statedType(s : String?) {
//        val value : String? = javaClass().getValue(s)
//        // ....
//        //        if not null check
//        //        NPE when java class returns null
//        //        Exception in thread "main" java.lang.NullPointerException: javaClass().value must not be null
//        //        at item3.whatisnull.statedType(whatisnull.kt:5)
//        //        at MainKt.main(Main.kt:27)
//        //        at MainKt.main(Main.kt)
//        println(value)
//    }
//
//    fun platformType(s : String?) {
//        val value = javaClass().getValue(s)
//
//        //        if not null check
//        //        Exception in thread "main" java.lang.NullPointerException
//        //        at item3.whatisnull.platformType(whatisnull.kt:18)
//        //        at MainKt.main(Main.kt:28)
//        //        at MainKt.main(Main.kt)
//        println(value.length)
//    }
//}