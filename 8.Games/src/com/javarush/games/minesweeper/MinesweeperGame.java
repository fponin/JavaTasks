package com.javarush.games.minesweeper;

import com.javarush.engine.cell.Game;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;


    public void initialize() {
        setScreenSize(SIDE, SIDE);
    }
}