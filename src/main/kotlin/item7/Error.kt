package item7

import java.io.File
import javax.sql.DataSource

sealed interface Error {
}

sealed class IOError(): Error{

}

class FileReadError(val file : File) : IOError() {

}

class DatabaseError(val source : DataSource): IOError() {

}

object RuntimeError : Error {

}

fun log(e : Error) = when(e) {
    is FileReadError -> { println("Error while reading file ${e.file}") }
    is DatabaseError -> { println("Error while reading from database ${e.source}") }
    RuntimeError -> { println("Runtime error") }
}

sealed class Result<out T>
class Success<out T>(val result: T) : Result<T>()
class Failure(val throwable: Throwable) : Result<Nothing>()

class JsonParsingException : Exception()

inline fun <reified T> String.readObject(): T? {

    //....
    if(incorrectSign) {
        return null
    }

    return result
}

inline fun <reified T> String.readObject(): Result<T> {
    //..
    var result : T?

    if(incorrectSign) {
        return Failure(JsonParsingException())
    }
    result = if(this.length > 10)  else null

    return Success(result)
}