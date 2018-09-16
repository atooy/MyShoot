package cn.tedu.shoot;

import java.awt.image.BufferedImage;

public class Hero extends FlyingObject {
    private static BufferedImage[] images;

    static {
        images = new BufferedImage[2];
        images[0] = loadImage("hero0.png");
        images[1] = loadImage("hero1.png");
    }

    private int life;
    private int doubleFire;

    public Hero() {
        super(97, 124, 140, 400);
        life = 3;
        doubleFire = 0;
    }

    public void moveTo(int x, int y) {
        System.out.println("英雄机随着鼠标移动");
    }

    public void step() {
        System.out.println("英雄机切换图片啦!");
    }

}