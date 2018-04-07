package lu.ewelohd.jconsoleimage.core;

/**
 * Main Class of the Api
 * Contains all the methods of the Api
 * @author EweLoHD
 * @version 1.0.0
 */

import lu.ewelohd.jconsoleimage.colors.ColorFormats;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ConsoleImage{


    File file;
    BufferedImage image;

    /**
     * The string path can be the path to you image in the Project Build or on your local storage or an URL to an online image.
     * I recommand to use images with a low resolution (Pixelarts), for example 30x20. Each pixel of the weight of your image will need one or two row(s) of the console.
     *
     * @param path is a string with the path to you image
     * @throws IOException
     */
    public void setImage(String path) throws IOException {
        file = new File(path);
        image = ImageIO.read(file);
    }




    String colorFormat;

    /**
     * Uses 8 colors (Ascii format) to print out the image.
     * Note: Some terminals (mostly on Windows) doesn't support Ascii colors!
     */
    public void set8Colors(){
        colorFormat = "8Colors";
    }




    int h = 0;
    int w = 0;

    /**
     * Prints out your image to the console.
     */
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

            if( (clr>>24) == 0x00 ) {
                System.out.printf("  ");
            }else {
                System.out.printf("\33[" + colornum + "██");
            }


        }
    }


}
