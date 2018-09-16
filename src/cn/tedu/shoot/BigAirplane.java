package cn.tedu.shoot;

import java.awt.image.BufferedImage;

public class BigAirplane extends FlyingObject {
    private static BufferedImage[] images;

    static {
        images = new BufferedImage[5];
        for (int i = 0; i < images.length; i++) {
            images[i] = loadImage("bigplane" + i + ".png");
        }
    }

    private int speed;

    public BigAirplane() {
        super(69, 99);
        speed = 2;
    }

    public void step() {
        System.out.println("大敌机的y坐标移动了:" + speed);
    }
}
