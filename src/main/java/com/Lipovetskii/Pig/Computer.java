package com.Lipovetskii.Pig;

public class Computer extends Player {

    static void makeSeries() {

      int seriesResult = 0;

        while (seriesResult < 20) {
            if(!checkResult()) break;
        }

        result += seriesResult;
        resultsLabel.setText(resultsLabel.getText()+result);

    }


}
