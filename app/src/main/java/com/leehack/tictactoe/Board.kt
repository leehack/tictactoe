package com.leehack.tictactoe

class Board(private val size: Int) {
    var done = false
    var turn = Cell.Status.X
    private val cells = Array(size) {
        Array(size) {
            Cell()
        }
    }

    fun check(x:Int, y:Int) : Boolean {
        if (done || x >= this.size || y >= size || cells[y][x].status != Cell.Status.NONE) {
            return false
        }

        cells[y][x].status =  turn
        done = checkWin()
        turn = if (turn == Cell.Status.X) Cell.Status.O else Cell.Status.X
        return true
    }

    fun checkWin() : Boolean {

        var found = true
        for (i in 0 until size) {
            if (cells[i][i].status != turn) {
                found = false
                break
            }
        }
        if (found) return true
        found = true
        for (i in 0 until size) {
            if (cells[size - 1 - i][i].status != turn) {
                found = false
                break
            }
        }
        if (found) return true
        for (i in 0 until size) {
            found = true
            for (j in 0 until size) {
                if (cells[i][j].status != turn) {
                    found = false
                    break
                }
            }
            if (found) break
        }
        if (found) return true
        for (i in 0 until size) {
            found = true
            for (j in 0 until size) {
                if (cells[j][i].status != turn) {
                    found = false
                    break
                }
            }
            if (found) break
        }
        return found
    }

    fun printBoard() {
        for (a in cells) {
            for (b in a) {
                print(b.status.toString() + " ")
            }
            println()
        }
    }
}