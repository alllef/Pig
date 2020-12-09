package com.Lipovetskii.Pig;

public class Game {


    static boolean hasWinner = false;

    static public short draw() {

        int playerResult = Dice.roll();
        Dice.dice.setSrc("img/"+Dice.diceImagesRoute.get(playerResult-1));
        int computerResult = Dice.roll();

        Human.resultsLabel.setText(ConstantVariable.HUMAN_NAME + ConstantVariable.RESULT + playerResult);
        Computer.resultsLabel.setText(ConstantVariable.COMPUTER_NAME + ConstantVariable.RESULT + computerResult);

        if (playerResult > computerResult) {
            LabelSetup.currentInformationLabel.setText(ConstantVariable.STAGE + "Player turn first");
            ButtonSetup.roll.setText("Go to game");
            return 0;
        }

        else if (playerResult < computerResult) {
            LabelSetup.currentInformationLabel.setText(ConstantVariable.STAGE + "Computer turn first");
            ButtonSetup.roll.setText("Go to game");
            return 1;
        }

        else {
            LabelSetup.currentInformationLabel.setText(ConstantVariable.STAGE + "Same. Redraw please");
        }

        return -1;
    }

    static void checkForWinner(int seriesResult, boolean player) {
        if (!player) {

            if (Human.result + seriesResult >= ConstantVariable.WIN_SCORE) {
                LabelSetup.currentInformationLabel.setText(ConstantVariable.STAGE + "You win");
                System.out.println("The end");
                hasWinner = true;
            }

        } else {

            if (Computer.result + seriesResult >= ConstantVariable.WIN_SCORE) {
                LabelSetup.currentInformationLabel.setText(ConstantVariable.STAGE + "You lose");
                System.out.println("The end");
                hasWinner = true;
            }

        }
    }

    static void startGame() {

        hasWinner = false;
        ButtonSetup.roll.setText("Draw");
        Computer.result = 0;
        Human.seriesResult = 0;
        Human.drawResult = -1;
        Human.result = 0;
        LabelSetup.currentInformationLabel.setText(ConstantVariable.STAGE + " draw");
        Human.resultsLabel.setText(ConstantVariable.HUMAN_NAME + ConstantVariable.RESULT);
        Computer.resultsLabel.setText(ConstantVariable.HUMAN_NAME+ConstantVariable.RESULT);
    }

}
