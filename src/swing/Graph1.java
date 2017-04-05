package swing;

import javax.swing.*;
import java.awt.*;

public class Graph1 {

    public static int width = 800;
    public static int height = 600;

    public static void init() {
        JFrame window = new JFrame( "Coucou !" );

        Point mouse = MouseInfo.getPointerInfo().getLocation();
        window.setBounds(mouse.x-100, mouse.y-100, Graph1.width, Graph1.height);
        window.setVisible(true);
    }

}
