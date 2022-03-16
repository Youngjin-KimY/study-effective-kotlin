package item9

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.nio.Buffer


// when using some of lib, explicitly using 'close'
// 'use' is good choice
// InputStream, OutputStream, java.sql.Connection, java.io.Reader(FileReader, BufferReader
// CSSParser), java.new.Socket, java.util.Scanner

class example {

    // old
    fun countCharactersInFile(path: String): Int {
        val reader = BufferedReader(FileReader(path))
        try {
            val a = reader.lineSequence().sumBy { it.length }
            println(a)
            return a
        } finally {
            reader.close()
        }
    }

    // Kotlin-style
    fun countCharactersInFileUse1(path: String): Int {
        val reader = BufferedReader(FileReader(path))
        reader.use {
            return reader.lineSequence().sumBy { it.length }
        }
    }

    fun countCharactersInFileUse2(path: String): Int {
        BufferedReader(FileReader(path)).use { reader
            -> return reader.lineSequence().sumBy { it.length }
        }
    }

    fun countCharactersInFileUse3(path: String): Int {
        File(path).useLines { lines ->
            return lines.sumBy { it.length }
        }
    }
}