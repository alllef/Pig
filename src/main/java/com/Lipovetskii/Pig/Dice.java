package com.Lipovetskii.Pig;

import com.vaadin.flow.component.html.Image;

import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

public class Dice {

    static ArrayList<String> diceImagesRoute = new ArrayList<>();
    static Image dice = new Image("img/edge1.jpg", "dice");

    static {
        parseImagesDirectory();
    }

    static void parseImagesDirectory() {
        File directory = new File("src/main/resources/META-INF/resources/img");

        for (File file : Objects.requireNonNull(directory.listFiles())) {
            diceImagesRoute.add(file.getName());

        }

    }

    public static int roll() {
        int result = (int) (Math.random() * 6);
        dice.setSrc("img/"+diceImagesRoute.get(result));
        return result+1;
    }


}
