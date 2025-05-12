package _my_bubble.test07;

import java.awt.*;
import java.awt.image.BufferedImage;

public class BackgroundPlayerService implements Runnable {

    private BufferedImage image;
    private Player player;

    public BackgroundPlayerService(Player player){
        this.player = player;
    }

    @Override
    public void run() {
        while(true){
            Color leftColor = new Color(image.getRGB(player.getX(),player.getY() + 25));
            Color rightColor = new Color(image.getRGB(player.getX(),player.getY() + 25));
        }
    }


}
