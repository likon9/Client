import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Showautoforclient extends JFrame {

    JLabel info, line , collum1, collum2, collum3,hatch;

    JPanel showauto = new JPanel();
    JButton back;

    public  Showautoforclient() {


        super("Пробное окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        showauto.setLayout(null);
        setLocation(700, 200);
        //  setSize(500, 500);
//
        Show show = new Show();
        try {
            show.Show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        hatch = new JLabel("|");
        hatch.setSize(5, 30);
        hatch.setLocation(25, 10);
        hatch.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(hatch);

        collum1 = new JLabel("id");
        collum1.setSize(30, 30);
        collum1.setLocation(30, 10);
        collum1.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(collum1);

        hatch = new JLabel("|");
        hatch.setSize(5, 30);
        hatch.setLocation(65, 10);
        hatch.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(hatch);

        collum2 = new JLabel("марка");
        collum2.setSize(100, 30);
        collum2.setLocation(70, 10);
        collum2.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(collum2);

        hatch = new JLabel("|");
        hatch.setSize(5, 30);
        hatch.setLocation(170, 10);
        hatch.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(hatch);

        collum3 = new JLabel("год выпуска");
        collum3.setSize(105, 30);
        collum3.setLocation(175, 10);
        collum3.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(collum3);

        hatch = new JLabel("|");
        hatch.setSize(5, 30);
        hatch.setLocation(280, 10);
        hatch.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(hatch);

        collum3 = new JLabel("цена");
        collum3.setSize(100, 30);
        collum3.setLocation(285, 10);
        collum3.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(collum3);

        hatch = new JLabel("|");
        hatch.setSize(5, 30);
        hatch.setLocation(385, 10);
        hatch.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(hatch);

        collum3 = new JLabel("статус");
        collum3.setSize(70, 30);
        collum3.setLocation(390, 10);
        collum3.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(collum3);

        hatch = new JLabel("|");
        hatch.setSize(5, 30);
        hatch.setLocation(475, 10);
        hatch.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(hatch);

        collum3 = new JLabel("Заказчик");
        collum3.setSize(100, 30);
        collum3.setLocation(480, 10);
        collum3.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(collum3);

        hatch = new JLabel("|");
        hatch.setSize(5, 30);
        hatch.setLocation(585, 10);
        hatch.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(hatch);

        String st = null;

        int t;
        for (t = 0; t < show.i; t++) {

            hatch = new JLabel("|");
            hatch.setSize(5, 30);
            hatch.setLocation(25, 30 + (20 * t));
            hatch.setFont(new Font("Serif", Font.PLAIN, 20));
            showauto.add(hatch);

            collum1 = new JLabel("" + show.idm[t]);
            collum1.setSize(30, 30);
            collum1.setLocation(30, 30 + (20 * t));
            collum1.setFont(new Font("Serif", Font.PLAIN, 20));
            showauto.add(collum1);

            hatch = new JLabel("|");
            hatch.setSize(5, 30);
            hatch.setLocation(65, 30 + (20 * t));
            hatch.setFont(new Font("Serif", Font.PLAIN, 20));
            showauto.add(hatch);

            collum2 = new JLabel("" + show.markm[t]);
            collum2.setSize(100, 30);
            collum2.setLocation(70, 30 + (20 * t));
            collum2.setFont(new Font("Serif", Font.PLAIN, 20));
            showauto.add(collum2);

            hatch = new JLabel("|");
            hatch.setSize(5, 30);
            hatch.setLocation(170, 30 + (20 * t));
            hatch.setFont(new Font("Serif", Font.PLAIN, 20));
            showauto.add(hatch);

            collum3 = new JLabel("" + show.agem[t]);
            collum3.setSize(105, 30);
            collum3.setLocation(175, 30 + (20 * t));
            collum3.setFont(new Font("Serif", Font.PLAIN, 20));
            showauto.add(collum3);

            hatch = new JLabel("|");
            hatch.setSize(5, 30);
            hatch.setLocation(280, 30 + (20 * t));
            hatch.setFont(new Font("Serif", Font.PLAIN, 20));
            showauto.add(hatch);

            collum3 = new JLabel("" + show.pricem[t]);
            collum3.setSize(100, 30);
            collum3.setLocation(285, 30 + (20 * t));
            collum3.setFont(new Font("Serif", Font.PLAIN, 20));
            showauto.add(collum3);

            hatch = new JLabel("|");
            hatch.setSize(5, 30);
            hatch.setLocation(385, 30 + (20 * t));
            hatch.setFont(new Font("Serif", Font.PLAIN, 20));
            showauto.add(hatch);

            if (show.statm[t] == 0) {
                st = "Доступно";
            }
            if (show.statm[t] == 1)
                st = "Заказано";
            if (show.statm[t] == 2)
                st = "Куплено";

            collum3 = new JLabel("" + st);
            collum3.setSize(90, 30);
            collum3.setLocation(390, 30 + (20 * t));
            collum3.setFont(new Font("Serif", Font.PLAIN, 20));

            showauto.add(collum3);

            hatch = new JLabel("|");
            hatch.setSize(5, 30);
            hatch.setLocation(475, 30 + (20 * t));
            hatch.setFont(new Font("Serif", Font.PLAIN, 20));
            showauto.add(hatch);

            collum3 = new JLabel("" + show.loginm[t]);
            collum3.setSize(100, 30);
            collum3.setLocation(485, 30 + (20 * t));
            collum3.setFont(new Font("Serif", Font.PLAIN, 20));

            showauto.add(collum3);

            hatch = new JLabel("|");
            hatch.setSize(5, 30);
            hatch.setLocation(585, 30 + (20 * t));
            hatch.setFont(new Font("Serif", Font.PLAIN, 20));
            showauto.add(hatch);

        }
        setSize(700, (t*20)+300);

        back =  new JButton("Назад");
        back.setSize(200,30);
        back.setLocation(250,(t*20)+150);
        showauto.add(back);

        back.addActionListener(new Butback());

        setContentPane(showauto);


    }

    public  class Butback implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == back )
            {
                dispose();
                JFrame menuclient1 = new MenuClient();
                menuclient1.setVisible(true);
            }
        }
    }

}