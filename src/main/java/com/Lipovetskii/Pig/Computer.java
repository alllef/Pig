package com.Lipovetskii.Pig;

import com.vaadin.flow.component.html.Label;

public class Computer {

    static int result = 0;
    static Label resultsLabel;

    static void makeSeries() {

        int seriesResult = 0;
        int turn = 1;
        while (seriesResult < 20) {
            int score = Dice.roll();

            if (score == 1) {
                seriesResult = 0;
                break;
            }

            else {
                turn += 1;
                seriesResult += score;
                Game.checkForWinner(seriesResult, true);
            }

        }

        while (isBetterProbability(turn)) {
            int score = Dice.roll();

            if (score == 1) {
                seriesResult = 0;
                break;
            }

            else {
                seriesResult += score;
                turn += 1;
                Game.checkForWinner(seriesResult, true);
            }

        }
        result += seriesResult;
        LabelSetup.currentInformationLabel.setText(LabelSetup.currentInformationLabel.getText() + ", Computer series result " + seriesResult);
        resultsLabel.setText(ConstantVariable.COMPUTER_NAME + ConstantVariable.RESULT + result);

    }

    private static boolean isBetterProbability(int turn) {

        double computerLooseProbability = 1 - Math.pow(5.0 / 6.0, turn);
        double turnNumberToWin = Math.ceil((ConstantVariable.WIN_SCORE - Human.result) / 4.0);
        double playerWinProbability = Math.pow(5.0 / 6.0, turnNumberToWin);

        return computerLooseProbability < playerWinProbability;
    }


}
