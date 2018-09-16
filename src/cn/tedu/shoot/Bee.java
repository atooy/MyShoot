package cn.tedu.shoot;

import java.awt.image.BufferedImage;
import java.util.Random;

public class Bee extends FlyingObject {
    private static BufferedImage[] images;

    static {
        images = new BufferedImage[5];
        for (int i = 0; i < images.length; i++) {
            images[i] = loadImage("bee" + i + ".png");
        }
    }

    private int xSPeed;
    private int ySpeed;
    private int awardType;

    public Bee() {
        super(60, 50);
        xSPeed = 1;
        ySpeed = 2;
        Random rand = new Random();
        awardType = rand.nextInt(2);
    }

    public void step() {
        System.out.println("小蜜蜂的x坐标移动了:" + xSPeed + ",y坐标移动了:" + ySpeed);
    }
}
