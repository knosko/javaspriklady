package gui.NiecoOmne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class MainTest {
    public static void main(String[] args) {


        JFrame frame = new JFrame("Niečo o mne"); // vytvorime okno
        frame.setMinimumSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ked kliknem na X na okne (cize vo frame) tak sa zatvori standardne
        frame.setLocationRelativeTo(null); // vycentrovanie okna


        // JFrame by mal obsahovat panel, teda container JPanel
        JPanel panel = new JPanel();
        panel.setLayout(null); // layout pre panel bude null, cize prazdny


        frame.setContentPane(panel); // my dany panel pridame do frame




 //DORIESIT NEFUNGUJE ---------
/*
        ImageIcon obrazok = new ImageIcon("pk.jpg");
        JLabel icon = new JLabel(obrazok);

        int width = obrazok.getIconWidth();
        int height = obrazok.getIconHeight();
        icon.setBounds(100, 100, width, height); // Nastavenie umiestnenia na (0, 0) a veľkosti na veľkosť obrázka

        panel.add(icon);
*/
//DORIESIT NEFUNGUJE ---------

        File myPic = new File("pk.jpg");
        JLabel imgLabel = new JLabel(new ImageIcon(myPic.getName()));
        imgLabel.setBounds(10,10,80,100);
        panel.add(imgLabel);



//----------------
        JLabel meno = new JLabel("Meno: Peter Knoško"); // popisok
        meno.setBounds(100,20,3500,20); // x, y, sirka, vyska
        panel.add(meno);

        JLabel mesto = new JLabel("Mesto: Brezno"); // popisok
        mesto.setBounds(100,40,350,20); // x, y, sirka, vyska
        panel.add(mesto);


// SOCIÁLNE SIETE--------------------------------

// FACEBOOK
        JLabel facebook = new JLabel("FB: https://www.facebook.com/peter.knosko.1"); // popisok
        facebook.setForeground(Color.BLUE.darker());
        facebook.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        facebook.setBounds(20,130,350,20); // x, y, sirka, vyska

        facebook.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // the user clicks on the label
                try {

                    Desktop.getDesktop().browse(new URI("https://www.facebook.com/peter.knosko.1"));

                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
        });

        panel.add(facebook);


// INSTAGRAM

        JLabel instagram = new JLabel("IG: https://www.instagram.com/peterknosko/"); // popisok
        instagram.setForeground(Color.BLUE.darker());
        instagram.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        instagram.setBounds(20,150,350,20); // x, y, sirka, vyska

        instagram.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // the user clicks on the label
                try {

                    Desktop.getDesktop().browse(new URI("https://www.instagram.com/peterknosko"));

                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }

        });


        panel.add(instagram);




        JTextArea niecoOmne = new JTextArea("Pracujem ako systemovy administrator, venujem sa \nspráve a konfiguráciám produkčných serverov,\nsprávam poč. sietí, firewallov, virtualizáciam infraštruktúr\ncez VMware a pod.\n\nSkúsenosti s programovaním v podstate nemám žiadne ;-)"); // popisok
        niecoOmne.setBounds(20,190,350,100); // x, y, sirka, vyska
        panel.add(niecoOmne);



        JButton btnOK = new JButton("OK");
        btnOK.setBounds(150, 320, 80, 20);

        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(meno.getText());
                System.out.println(mesto.getText());
                System.out.println(facebook.getText());
                System.out.println(instagram.getText());
                System.out.println(niecoOmne.getText());

                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });
        panel.add(btnOK);


        // display it
        frame.pack();
        frame.setVisible(true);


    }

}




