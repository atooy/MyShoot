package cn.tedu.shoot;

import java.awt.image.BufferedImage;

public class Bullet extends FlyingObject {
    private static BufferedImage image;

    static {
        image = loadImage("bullet.png");
    }

    private int speed;

    public Bullet(int x, int y) {
        super(8, 4, x, y);
        speed = 3;
    }

    public void step() {
        System.out.println("子弹的y坐标移动了:" + speed);
    }
}
