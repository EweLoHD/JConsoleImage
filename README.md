# JConsoleImage
JConsoleImage is a small Java API to print images (pixelarts) in your console or terminal.

![/examples/mario.png](./examples/mario_output.png)

## Installation
- #### Jar
You can find the latest jar in the [Releases](https://github.com/EweLoHD/JConsoleImage/releases), which you can add as library to your projectbuild.

- #### Maven 
*Coming soon!*

## Usage
### Basic Example
This will print out the image [mario.png](examples/mario.png)(12x16) to the console.

```java        
ConsoleImage myImage = new ConsoleImage();
  
myImage.setImage("examples/mario.png");
myImage.set8Colors();
myImage.useHalfPixels(true);
   
myImage.build();
```
**Result:** 

![/examples/mario.png](./examples/mario_output_full.png)

### Explications 
#### `.setImage(String path)`
The string `Path` can be the path to you image in the Project Build or on your local storage or an URL to an online image.
I recommand to use images with a low resolution (Pixelarts), for example 30x20. Each pixel of the weight of your image will need one or two row(s) of the console. *The feature of resizing images will come soon!*

