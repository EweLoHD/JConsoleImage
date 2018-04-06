package colors;


import java.util.Arrays;

public class ColorFormats {

    public int get8Color(int red, int green, int blue){


        /*int[] r8 = {0,  255,  0,    255,  0,    255,  0,    255};
        int[] g8 = {0,  0,    255,  255,  0,    0,    255,  255};
        int[] b8 = {0,  0,    0,    0,    255,  255,  255,  255};*/

        String[] colors = {"000", "25500", "02550", "2552550", "00255", "2550255", "0255255", "255255255"};

        int r8 = 0;
        int g8 = 0;
        int b8 = 0;

        if(red > 127){r8 = 255;}
        if(green > 127){g8 = 255;}
        if(blue > 127){b8 = 255;}

        String xcolor = Integer.toString(r8) + String.valueOf(g8) + String.valueOf(b8);

        int color = 1;
        /*for (int i=0; i<colors.length; i++){

            if(colors[i] == xcolor){
                color = 30+i;
            }
        }*/

        switch (xcolor){
            case "000": //black
                color = 30;
                break;

            case "25500": //red
                color = 31;
                break;

            case "02550": //green
                color = 32;
                break;

            case "2552550": //yellow
                color = 33;
                break;

            case "00255": //blue
                color = 34;
                break;

            case "2550255": //magenta
                color = 35;
                break;

            case "0255255": //cyan
                color = 36;
                break;

            case "255255255": //white / light gray
                color = 27;
                break;
        }

        return color;
    }
}
