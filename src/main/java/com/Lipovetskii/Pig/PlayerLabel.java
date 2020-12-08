package com.Lipovetskii.Pig;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class PlayerLabel extends HorizontalLayout {

    Label[] labelList;
    static Label currentInformationLabel = new Label("current stage:");

    PlayerLabel() {
        Computer.initializeLabel("Computer");
        Human.initializeLabel("Human");

        labelList = new Label[]{Human.resultsLabel, currentInformationLabel, Computer.resultsLabel};

        for (Label tmp : labelList) {
            System.out.println(tmp.getText());
            add(tmp);
           // tmp.getStyle().set("width", "30vh").set("font-size", "18pt");
        }

    }
}

