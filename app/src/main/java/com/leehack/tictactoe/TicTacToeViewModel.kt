package com.leehack.tictactoe

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableArrayMap

class TicTacToeViewModel : ViewModel() {

    private val board = Board(3)
    var cells = ObservableArrayMap<String, String>()
    var message : MessageInterface? = null

    fun onClickedCellAt(x: Int, y: Int) {
        val status = board.turn
        if (board.check(x, y)) {
            cells["" + x + y] = when (status) {
                Cell.Status.X -> "X"
                else -> "O"
            }
            if (board.done) {
                message?.showMessage("WIN:$status")
            }
        }
    }
}