package test;

import colors.ColorFormats;
import core.ConsoleImage;

public class Test {
    public static void main(String[] args){
        ConsoleImage consoleImage = new ConsoleImage();
        ColorFormats colorFormats = new ColorFormats();

        System.out.println(colorFormats.get8Color(142, 68, 173));

    }
}
