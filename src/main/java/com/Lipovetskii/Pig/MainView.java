package com.Lipovetskii.Pig;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.router.Route;

import java.io.File;

/**
 * The main view contains a button and a click listener.
 */
@Route
@PWA(name = "My Application", shortName = "My Application")
public class MainView extends VerticalLayout {

    public MainView() {

        PlayerLabel label = new PlayerLabel();
        Image image = new Image();
        image.setSrc("img/edge1.jpg");

        Button button = new Button("Hold", event -> Human.hold());
        Button roll = new Button("Roll",
                event -> Human.roll());

        add(label, Dice.dice, button, roll);
    }
}
