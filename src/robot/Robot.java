package robot;

import java.awt.*;
import java.util.ArrayList;

public class Robot implements Runnable {

    public static void main() {
        Map map = new Map();
        ArrayList<Robot> robots = new ArrayList<Robot>();
        for(int i=0; i<10; i++) {
            Robot r = new Robot("Wall-ed"+i, 100, new Point(0, 10) );
            robots.add(r);
        }

        for (Robot r : robots) {
            r.initThread();
            r.run();
        }
    }

    private String name;
    private Point p;
//    private Map map;

    private float fuel;
    private int mineral;
    private int choice;

    private Thread th;

    public Robot(String name, float fuel, Point p/*, Map map, int mineral*/) {
        this.name = name;
        this.p = p;
        this.fuel = fuel;

        /*
        this.map = map;
        this.mineral = mineral;
        */
    }

    public void initThread() {
        th = new Thread(this, name);
        th.start();
    }

    @Override
    public void run() {
        while(th.currentThread() == th) {
            work();

            try {
//                Thread.sleep(0);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(name +" : " + e);

            }
        }
    }

    public void work() {
        if( fuel <= 0 ) {
            System.out.println(name +" : Fuck you");
            stop();
        } else {
            choice = (int)(Math.random() * 6);
            switch (choice) {
                case 0:
                    p.x++;
                    p.y++;
                    fuel--;
                    break;
                case 1:
                    p.x++;
                    p.y--;
                    fuel--;
                    break;
                case 2:
                    p.x--;
                    p.y++;
                    fuel--;
                    break;
                case 3:
                    p.x--;
                    p.y--;
                    fuel--;
                    break;
                case 4:
                    System.out.println(name +" : JE NAVANCERAI PAS ESPECE DANKULAY");
                    break;
                case 5:
                    System.out.println(name + ": Saute (ta mere)");
                    fuel += 5;
                    break;
                default:
                    throw new AssertionError();
            }
            if(p.x >= 35 | p.y >= 35 | p.x <= -35 | p.y <= -35) {
                System.out.println(name + " : Mur");
                stop();
            }
        }
    }

    public void stop() {
        th = null;
    }
}
