import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class KnopH8 extends Applet {
    TextField woordvak;
    Button druk;
    TextField tekstvak;
    Button knop;
    String schermtekst;


    public void init() {
        tekstvak = new TextField("Type hier iets",20);
        add(tekstvak);
        knop = new Button("enter");
        knop.setLabel( "enter" );
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
        schermtekst = "vul wat in.";

        woordvak = new TextField("reset",20);
        druk = new Button("Reset");
        druk.setLabel("Reset");
        ResetListener np = new ResetListener();
        druk.addActionListener( np );
        add(druk);

    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 70, 100 );
        setBackground(Color.GREEN);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ){
            schermtekst = tekstvak.getText();
            repaint();
        }
    }
    class ResetListener implements ActionListener {
        public void actionPerformed( ActionEvent e ){
            schermtekst = "vul weer wat in.";
            tekstvak.setText(schermtekst);
            repaint();
        }
    }
}