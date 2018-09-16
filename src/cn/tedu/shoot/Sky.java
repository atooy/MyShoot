package cn.tedu.shoot;

import java.awt.image.BufferedImage;

public class Sky extends FlyingObject {
    private static BufferedImage image;

    static {
        image = loadImage("background.png");
    }

    private int speed;
    private int y1;

    public Sky() {
        super(400, 700, 0, 0);
        speed = 1;
        y1 = -700;
    }

    public void step() {
        System.out.println("天空的y坐标和y1坐标移动了:" + speed);
    }
}
