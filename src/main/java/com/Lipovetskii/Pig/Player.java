package com.Lipovetskii.Pig;

import com.vaadin.flow.component.html.Label;

public  class Player {

    static int result = 0;
    
    static Label resultsLabel;

   static void initializeLabel(String playerName) {
        resultsLabel = new Label(playerName + "\n result:");
    }

    static boolean checkResult(){
        int dropResult = Dice.roll();

        if (dropResult == 1) {
            return false;
        }

        else {
            seriesResult += dropResult;
        }
        return true;
    }

}
