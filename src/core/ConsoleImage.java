package core;

import colors.ColorFormats;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ConsoleImage{

    String ImageString = "Error! Missing color format.";

    /*Image*/
    File file;
    BufferedImage image;


    //Set the Image Path
    public void setImage(String path) throws IOException {
        file = new File(path);
        image = ImageIO.read(file);
    }


    /*Color Formats*/
    String colorFormat;

    //8Bit Format
    public void set8Colors(){
        colorFormat = "8Colors";
    }

    //16Bit Format
    public void set16Colors(){

    }

    public void set256Colors(){

    }


    /*Pixels*/
    boolean hpixel = false;

    //UseHalfPixels
    public void useHalfPixels(boolean useHalfPixels){
        hpixel = useHalfPixels;
    }
    int h = 0;
    int w = 0;

    /*Build*/
    //print out
    public void build(){
        for (int i = 1; i < 9000000; i++){

            if(i - 1 == image.getWidth() * image.getHeight()){
                break;
            }

            if(i == 1){
                w = 0;
            }else {
                w = w + 1;
            }

            if (image.getWidth() == w){
                h = h + 1;
                w = 0;
                System.out.printf("\n");
            }

            int clr = image.getRGB(w, h);
            int red = (clr & 0x00ff0000) >> 16;
            int green = (clr & 0x0000ff00) >> 8;
            int blue = clr & 0x000000ff;

            ColorFormats colorFormats = new ColorFormats();

            int colornum = 30;

            switch (colorFormat){
                case "8Colors": colornum = colorFormats.get8Color(red, green, blue);
                break;
            }

            //System.out.println(w + "x" + h);
            System.out.printf("\33[" + colornum + "m██");

        }
    }


}
