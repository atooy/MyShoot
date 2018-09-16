package cn.tedu.shoot;

import javax.imageio.ImageIO;
import java.util.Random;
import java.awt.image.BufferedImage;

public class FlyingObject {
    protected int width;
    protected int height;
    protected int x;
    protected int y;

    public FlyingObject(int width, int height) {
        this.width = width;
        this.height = height;
        Random rand = new Random();
        x = rand.nextInt(400 - this.width);
        y = -this.height;
    }

    public FlyingObject(int width, int height, int x, int y) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public static BufferedImage loadImage(String fileName) {
        try {
            BufferedImage img = ImageIO.read(FlyingObject.class.getResource(fileName));
            return img;

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public void step() {
        System.out.println("飞行物移动了!");
    }
}
