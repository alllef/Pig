package com.Lipovetskii.Pig;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ButtonSetup extends VerticalLayout {

   static Button hold = new Button("Hold", event -> Human.hold());
   static Button roll = new Button("Draw",

            event -> Human.roll());
   static Button restart = new Button("New game",event ->Game.startGame() );

    ButtonSetup(){
        getStyle().set("margin-left","auto").set("margin-right","auto").set("width","100vh").set("padding-left","19%");
        add(hold,roll,restart);
    }

}
