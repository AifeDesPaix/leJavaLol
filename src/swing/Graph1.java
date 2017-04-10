package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Graph1 {

    private static int width = 800;
    private static int height = 600;

    private static JFrame window;
    private static JPanel panButtons;

    private static JButton buttonGreen;
    private static JButton buttonRed;
    private static JButton buttonBlue;
    private static JButton buttonCoucou;
    private static JButton buttonAurevoir;

    public static void init() {
        // Créer fenetre
        window = new JFrame( "Bonsoire !" );

        // Place la window
        Graph1.windowPlacement();
        // Ajoute buttons
        Graph1.addButtons();
        // Ajoute labels
        Graph1.addLabels();

        // Affiche fenetre
        window.setVisible(true);
        // Eteint au clic croix
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public static void windowPlacement() {
        Point mouse = MouseInfo.getPointerInfo().getLocation();
        window.setBounds(mouse.x-Graph1.width/2, mouse.y, Graph1.width, Graph1.height);

    }

    public static void addButtons() {
        final JButton[] buttons = new JButton[3];

        // Créer panel (groupe)  de bouttons
        final JPanel panButtons = new JPanel();
        panButtons.setBackground(Color.black);

        // Créer buttons
        buttonGreen = new JButton("Green");
        buttonGreen.setName("Green");
        buttonGreen.setBackground(Color.green);

        buttonRed = new JButton("Red");
        buttonRed.setName("Red");
        buttonRed.setBackground(Color.red);

        buttonBlue = new JButton("Blue");
        buttonBlue.setName("Blue");
        buttonBlue.setBackground(Color.blue);

        buttonCoucou = new JButton("Mode COUCOU");
        buttonAurevoir = new JButton("Mode Aurevoir");


        // Place curseur main survol bouttons
        buttonGreen.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buttonRed.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
        buttonBlue.setCursor(Cursor.getPredefinedCursor(Cursor.NE_RESIZE_CURSOR));
        buttonCoucou.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        buttonAurevoir.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));


        // Place bouton dans panel
        panButtons.add(buttonGreen);
        panButtons.add(buttonRed);
        panButtons.add(buttonBlue);
        panButtons.add(buttonCoucou);
        panButtons.add(buttonAurevoir);

        // Ajotue event click sur chaque bouton
        buttonGreen.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                panButtons.setBackground(Color.green);
            }
        });
        buttonRed.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                panButtons.setBackground(Color.red);
            }
        });
        buttonBlue.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                panButtons.setBackground(Color.blue);
            }
        });
        buttonCoucou.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                window.setTitle("COUCOU !!");
            }
        });

        buttonAurevoir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                window.setTitle("AUREVOIR !!");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                buttonRed.setBackground(Color.white);
                buttonAurevoir.setBackground(Color.white);
                buttonGreen.setBackground(Color.white);
                buttonBlue.setBackground(Color.white);
                buttonCoucou.setBackground(Color.white);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                buttonRed.setBackground(Color.red);
                buttonAurevoir.setBackground(Color.white);
                buttonGreen.setBackground(Color.green);
                buttonBlue.setBackground(Color.blue);
                buttonCoucou.setBackground(Color.white);
            }
        });
        // Ajoute le panel à la window
        window.getContentPane().add(panButtons);
    }

    public static void addLabels() {
//        JLabel fdp = new JLabel("Jew");
//        window.getContentPane().add(fdp);
    }
}
