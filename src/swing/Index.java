package swing;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Index extends JFrame implements MouseInputListener {

    private JButton boutonVert;
    private JButton bouton2;

    public Index() {
        setLayout(null);
        setSize(800, 600);

        boutonVert = new JButton("Vert");
        bouton2 = new JButton("Eteindre.");


        getContentPane().add(boutonVert);






        boutonVert.addMouseListener(this);
        bouton2.addMouseListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        Font f = new Font();

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e);
        if(e.getSource() == boutonVert) {
            System.out.println("Click 1");
        } else if(e.getSource() == bouton2) {
            bouton2.setBackground(Color.red);
            System.out.println("Click 2");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
