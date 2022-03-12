package item3

interface UserRepo {
    // Declaration has type inferred from a platform call,
    // which can lead to unchecked nullability issues.
    // Specify type explicitly as nullable or non-nullable.
//    fun getUserName(s : String?) = javaClass().getValue(s)
}