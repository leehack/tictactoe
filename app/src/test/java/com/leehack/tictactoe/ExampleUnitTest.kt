package com.leehack.tictactoe

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    val board = Board(3)
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun printBoard() {
        println(board.check(0, 0))
        println(board.check(0, 1))
        println(board.check(1, 1))
        println(board.check(2, 1))
        println(board.check(2, 2))
        board.printBoard()
    }
}
