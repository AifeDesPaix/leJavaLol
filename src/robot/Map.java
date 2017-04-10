package robot;

import java.awt.*;
import java.util.ArrayList;

public class Map {

    Point p;
    ArrayList<Point> mineral = new ArrayList();

    public Map() {

    }

    public void fill() {
        for(int i = 0; i < 10000; i++) {
            // todo refaire lol
            Point minralPos = new Point((int)(Math.random() * 35), (int)(Math.random() * 35));
            addMineral(minralPos);
        }
        System.out.println("Fills end");
    }

    public void addMineral(Point p) {
        mineral.add(p);
    }
}
