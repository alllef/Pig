package com.Lipovetskii.Pig;

public class Human extends Player {
    static int seriesResult = 0;

    static void roll() {
        if (!Game.stage) Game.draw();
        else {

            if (!checkResult()) {
                resultsLabel.setText(resultsLabel.getText() + result);
                Computer.makeSeries();
            }

        }
    }

    static void hold() {
        result += seriesResult;
        resultsLabel.setText(resultsLabel.getText() + result);
        seriesResult = 0;
        Computer.makeSeries();
    }
}
