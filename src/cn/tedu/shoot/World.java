package cn.tedu.shoot;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class World extends JPanel {
    private Sky sky = new Sky();
    private Hero hero = new Hero();
    private FlyingObject[] enemies = {};
    private Bullet[] bullets = {};

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        World world = new World();
        frame.add(world);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 700);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        world.action();

    }

    public void action() {
        enemies = new FlyingObject[5];
        enemies[0] = new Airplane();
        enemies[1] = new Airplane();
        enemies[2] = new BigAirplane();
        enemies[3] = new BigAirplane();
        enemies[4] = new Bee();
        for (int i = 0; i < enemies.length; i++) {
            enemies[i].step();
        }
        sky.step();
        hero.step();
    }
}