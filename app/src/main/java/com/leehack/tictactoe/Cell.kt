package com.leehack.tictactoe

import com.leehack.tictactoe.Cell.Status.NONE

class Cell {
    enum class Status {
        NONE, O, X
    }
    var status : Status = NONE
}