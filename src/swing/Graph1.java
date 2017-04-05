package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Graph1 {

    public static int width = 800;
    public static int height = 600;

    public static JFrame window;
    public static JPanel panButtons;

    public static JButton buttonGreen;
    public static JButton buttonRed;
    public static JButton buttonBlue;
    public static JButton buttonCoucou;
    public static JButton buttonAurevoir;

    public static void init() {
        // Créer fenetre
        window = new JFrame( "Bonsoire !" );

        // Place la window
        Graph1.windowPlacement();
        // Ajoute buttons
        Graph1.addButtons();

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


        // Place curseur main survol boutton
        buttonGreen.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buttonRed.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buttonBlue.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buttonCoucou.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buttonAurevoir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // Créer panel (groupe)  de bouttons
        final JPanel panButtons = new JPanel();
        panButtons.setBackground(Color.black);

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
        });

        // Ajoute le panel à la window
        window.getContentPane().add(panButtons);
    }
}
