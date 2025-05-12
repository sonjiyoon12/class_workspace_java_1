package _my_bubble.test07;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BackgroundBubbleService {

    private BufferedImage image;
    private Bubble bubble;

    public BackgroundBubbleService(Bubble bubble) {
        try {
            image = ImageIO.read(new File("img/BackgroundMapService.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean leftWall() {
        Color leftColor = new Color(image.getRGB(bubble.getX() + 10, bubble.getY() + 25));
        if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
            return true;
        }
        return false;
    }

    public boolean rightWall() {
        Color rightColor = new Color(image.getRGB(bubble.getX() + 70, bubble.getY() + 25));
        if(rightColor.getRGB()== 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0){
            return true;
        }
        return  false;
    }

    public boolean topWall() {
        Color upColor = new Color(image.getRGB(bubble.getX() + 70, bubble.getY() + 25));
        if (upColor.getRGB() == 255 && upColor.getGreen() == 0 && upColor.getBlue() == 0) {
            return true;
        }
        return false;
    }
}
