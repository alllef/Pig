package com.Lipovetskii.Pig;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class LabelSetup extends VerticalLayout {

    Label[] labelList;
    static Label currentInformationLabel = new Label(ConstantVariable.STAGE + " draw");


    LabelSetup() {
        getStyle().set("margin-left", "auto").set("margin-right", "auto").set("width", "100vh").set("padding-left", "16%");
        Human.resultsLabel = new Label(ConstantVariable.HUMAN_NAME + ConstantVariable.RESULT);
        Computer.resultsLabel = new Label(ConstantVariable.COMPUTER_NAME + ConstantVariable.RESULT);

        labelList = new Label[]{Human.resultsLabel, currentInformationLabel, Computer.resultsLabel};

        for (Label tmp : labelList) {
            add(tmp);
            tmp.getStyle().set("font-size", "18pt");
        }

    }
}

