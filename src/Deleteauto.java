import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Deleteauto extends JFrame {

    JLabel collum1, collum2, collum3, hatch, ldel;
    JTextField idd;
    JPanel showauto = new JPanel();
    JButton back,del;
    int i;
    int id[]= new int[999];
    Clientconnetc clientconnetc = new Clientconnetc();


    public Deleteauto() {


        super("Пробное окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        showauto.setLayout(null);
        setLocation(700, 200);
        setSize(500, 500);
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
            i++;
            id[t]=show.idm[t];

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

        ldel = new JLabel("Введите id записи, которую хотите удалить:");
        ldel.setSize(280, 30);
        ldel.setLocation(150, (t * 20) + 100);
        showauto.add(ldel);

        idd = new JTextField();
        idd.setSize(100, 30);
        idd.setLocation(400, (t * 20) + 100);
        showauto.add(idd);

        del = new JButton("Удалить");
        del.setSize(180, 30);
        del.setLocation(150, (t * 20) + 150);
        showauto.add(del);

        back = new JButton("Назад");
        back.setSize(180, 30);
        back.setLocation(370, (t * 20) + 150);
        showauto.add(back);

        back.addActionListener(new Butback());
        del.addActionListener(new Butdel());

        setContentPane(showauto);


    }

    public class Butback implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == back) {
                try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(-2);
                    clientconnetc.Closesocket();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

                dispose();
                MenuAdmin menuAdmin = new MenuAdmin();
                menuAdmin.setVisible(true);
            }
        }
    }

    public class Butdel implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == del) {

                int number;
                try {

                    number = Integer.parseInt(idd.getText());


                } catch(NumberFormatException ex) {
                    number=-1;

                }

                int r=0;
                for(int y=0;y<i;y++)
                {
                    if(id[y]==number)
                    {r++;}
                }

                try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(number);
             int ot = (int) clientconnetc.cois.readObject()    ;
                    clientconnetc.Closesocket();
                } catch (IOException | ClassNotFoundException ioException) {
                    ioException.printStackTrace();
                }

                if(r>0)
                {
                    dispose();
                    JFrame  e1= new Success(1);
                    e1.setVisible(true);
                }
                else{
                    dispose();
                    JFrame  e1= new Error(1);
                    e1.setVisible(true);
                }



            }
        }
    }
}