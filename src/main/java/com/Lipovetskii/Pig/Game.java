package com.Lipovetskii.Pig;

public class Game {
    static boolean stage = false;


    static public boolean draw() {
        stage = true;
        int playerResult = Dice.roll();
        int computerResult = Dice.roll();

        if (playerResult > computerResult) return true;
        else if (playerResult < computerResult) return false;
        else draw();

        return false;
    }
}
