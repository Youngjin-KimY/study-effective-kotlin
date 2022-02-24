
//가변성 제한하기
class UserHolder {
    private val storedUsers : MutableMap<Int, String>
    = mutableMapOf()

    fun loadAll() : Map<Int, String> {
        return storedUsers
    }
}