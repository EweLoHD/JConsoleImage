# JConsoleImage
[![forthebadge](https://forthebadge.com/images/badges/made-with-java.svg)](https://forthebadge.com)
[![forthebadge](https://forthebadge.com/images/badges/built-with-love.svg)](https://forthebadge.com)
[![forthebadge](https://forthebadge.com/images/badges/kinda-sfw.svg)](https://forthebadge.com)

JConsoleImage is a small Java API to print images (pixelarts) in your console or terminal.

![alt text](https://raw.githubusercontent.com/EweLoHD/JConsoleImage/master/examples/mario_output.PNG?token=AVlmIvgQFXksLiKtDC0qnhnlE8Y4lqZSks5a0S-mwA%3D%3D)

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
   
myImage.build();
```
**Result:** 

![/examples/mario.png](https://raw.githubusercontent.com/EweLoHD/JConsoleImage/master/examples/mario_output_full.PNG?token=AVlmIhPEmlZ8y73FOAK6xAGwbrd3bO7Bks5a0TAfwA%3D%3D)

### Explications 

#### `.setImage(String path)`
The string `Path` can be the path to you image in the Project Build or on your local storage or an URL to an online image.
I recommend to use images with a low resolution (Pixelarts), for example 30x20. Each pixel of the weight of your image will need one or two row(s) of the console. *The feature of resizing images will come soon!*

#### `.set`x`Colors`
**Possibilities:**
- set8Colors()

> *Coming soon:*
> - set2Colors()
> - set16Colors()
> - set256Colors()
> - setGrayScale()

**Some terminals doesn't support colors or only 8 or 16 colors.** The Windows Terminal (cmd) doesn't support Ascii colors, but the most Linux terminals or Bash support (256) Colors. See [Bash tips: Colors and formatting ](https://misc.flogisoft.com/bash/tip_colors_and_formatting) for more information!

#### `.build()`
Prints out your image to the console.

## Documentation
You can find the JavaDocs of the Api [here](https://ewelohd.github.io/JConsoleImage/JavaDocs/).

## Contributing 
### Authors
- EweLoHD - *Founder & Head-Developer*

### How to contribute
I would really appreciate it if somebody could help me on this project to make it better. Look at the [CONTRIBUTING.md](CONTRIBUTING.md) for more information.

### To-Do
- [ ] Maven Support
- [ ] set2Colors()
- [ ] set16Colors()
- [ ] set256Colors()
- [ ] setGrayScale()
- [ ] Resize Images

## License
This project is licensed under the MIT license. See [LICENSE](https://github.com/EweLoHD/JConsoleImage/blob/master/LICENSE).
