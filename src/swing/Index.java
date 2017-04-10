package swing;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Index extends JFrame implements MouseInputListener {

    private JPanel panTest;

    private JButton boutonVert;
    private JButton bouton2;

    public Index() {
//        setLayout(null);
        setBounds(0, 0, 800, 600);

        panTest = new JPanel();
        getContentPane().add(panTest);

        addBouton("Vert");
        addBouton("Eteindre");

        addNewText("Ceux qui prennent des maîtres à côté d'Allah, ressemblent à l'araignée, qui se fait à elle-même une maison. En vérité, c'est la plus frêle des maisons que la maison de l'araignée ; s'ils le savaient !");

        JTextArea pd = new JTextArea("ÖQSZDGHMIOVFSEOHDI VGWBYRFCH  4?Ö", 30, 30);
        JScrollPane scrollTest = new JScrollPane(pd);
        panTest.add(scrollTest);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
    }

    public JPanel getPanTest() {
        return panTest;
    }

    public void setPanTest(JPanel panTest) {
        this.panTest = panTest;
    }

    public void addNewText(String text) {
        JTextArea jText = new JTextArea(text);
        jText.setColumns(50);

        getPanTest().add(jText);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if(e.getSource() == boutonVert) {

            boutonVert.setBackground(Color.yellow);

        } else if(e.getSource() == bouton2) {

            bouton2.setBackground(Color.red);

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

    public void addBouton(String name) {

        JButton btn = new JButton(name);
        panTest.add(btn);
        btn.addMouseListener(this);

    }
}
