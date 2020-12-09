package com.Lipovetskii.Pig;

import com.vaadin.flow.component.html.Label;

public class Human {

    static int seriesResult = 0;
    static int result = 0;
    static Label resultsLabel;
    static int drawResult = -1;

    static void roll() {

        if (Game.hasWinner) return;

        if (ButtonSetup.roll.getText().equals("Go to game")) {

            if (drawResult == 1) Computer.makeSeries();

            drawResult = 2;
            resultsLabel.setText(ConstantVariable.HUMAN_NAME + ConstantVariable.RESULT + result);
            ButtonSetup.roll.setText("Roll");
            return;
        }

        if (drawResult == -1) drawResult = Game.draw();
        else {

            int score = Dice.roll();
            Dice.dice.setSrc("img/" + Dice.diceImagesRoute.get(score - 1));

            if (score == 1) {
                seriesResult = 0;
                LabelSetup.currentInformationLabel.setText(ConstantVariable.STAGE + " Last player seriesResult " + seriesResult);

                Computer.makeSeries();
            }

            else {
                seriesResult += score;
                Game.checkForWinner(seriesResult, false);
                LabelSetup.currentInformationLabel.setText(ConstantVariable.STAGE + " roll score " + score + ", series result " + seriesResult);
            }

        }
    }

    static void hold() {
        if (Game.hasWinner) return;

        result += seriesResult;
        resultsLabel.setText(ConstantVariable.HUMAN_NAME + ConstantVariable.RESULT + result);
        LabelSetup.currentInformationLabel.setText(ConstantVariable.STAGE + " Last player seriesResult " + seriesResult);
        seriesResult = 0;

        Computer.makeSeries();
    }
}
