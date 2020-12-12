import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ShowusersJ extends JFrame {

    JLabel info, line , collum1, collum2, collum3,hatch;

    JPanel showauto = new JPanel();
    JButton back;

    public ShowusersJ() {


        super("Пробное окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        showauto.setLayout(null);
        setLocation(700, 200);
        //  setSize(500, 500);
//
        Showusers showusers = new Showusers();
        try {
            showusers.Showusers();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        hatch = new JLabel("|");
        hatch.setSize(5, 30);
        hatch.setLocation(100, 10);
        hatch.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(hatch);

        collum1 = new JLabel("id");
        collum1.setSize(30, 30);
        collum1.setLocation(105, 10);
        collum1.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(collum1);

        hatch = new JLabel("|");
        hatch.setSize(5, 30);
        hatch.setLocation(135, 10);
        hatch.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(hatch);

        collum2 = new JLabel("логин");
        collum2.setSize(100, 30);
        collum2.setLocation(140, 10);
        collum2.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(collum2);

        hatch = new JLabel("|");
        hatch.setSize(5, 30);
        hatch.setLocation(240, 10);
        hatch.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(hatch);

        collum3 = new JLabel("пароль");
        collum3.setSize(105, 30);
        collum3.setLocation(245, 10);
        collum3.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(collum3);

        hatch = new JLabel("|");
        hatch.setSize(5, 30);
        hatch.setLocation(350, 10);
        hatch.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(hatch);


        String st = null;

        int t;
        for (t = 0; t < showusers.i; t++) {

            hatch = new JLabel("|");
            hatch.setSize(5, 30);
            hatch.setLocation(100, 30 + (20 * t));
            hatch.setFont(new Font("Serif", Font.PLAIN, 20));
            showauto.add(hatch);

            collum1 = new JLabel("" + showusers.idm[t]);
            collum1.setSize(30, 30);
            collum1.setLocation(105, 30 + (20 * t));
            collum1.setFont(new Font("Serif", Font.PLAIN, 20));
            showauto.add(collum1);

            hatch = new JLabel("|");
            hatch.setSize(5, 30);
            hatch.setLocation(135, 30 + (20 * t));
            hatch.setFont(new Font("Serif", Font.PLAIN, 20));
            showauto.add(hatch);

            collum2 = new JLabel("" + showusers.loginm[t]);
            collum2.setSize(100, 30);
            collum2.setLocation(140, 30 + (20 * t));
            collum2.setFont(new Font("Serif", Font.PLAIN, 20));
            showauto.add(collum2);

            hatch = new JLabel("|");
            hatch.setSize(5, 30);
            hatch.setLocation(240, 30 + (20 * t));
            hatch.setFont(new Font("Serif", Font.PLAIN, 20));
            showauto.add(hatch);

            collum3 = new JLabel("" + showusers.passm[t]);
            collum3.setSize(105, 30);
            collum3.setLocation(245, 30 + (20 * t));
            collum3.setFont(new Font("Serif", Font.PLAIN, 20));
            showauto.add(collum3);

            hatch = new JLabel("|");
            hatch.setSize(5, 30);
            hatch.setLocation(350, 30 + (20 * t));
            hatch.setFont(new Font("Serif", Font.PLAIN, 20));
            showauto.add(hatch);


        }
        setSize(500, (t*20)+300);

        back =  new JButton("Назад");
        back.setSize(200,30);
        back.setLocation(150,(t*20)+150);
        showauto.add(back);

        back.addActionListener(new Butback());

        setContentPane(showauto);


    }

    public  class Butback implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == back )
            {
                dispose();
                MenuAdmin menuAdmin= new MenuAdmin();
                menuAdmin.setVisible(true);
            }
        }
    }

}