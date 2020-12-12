import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Showauto2 extends JFrame {

    JLabel info , collum1, collum2, collum3,hatch;
    JTextField id;
    JPanel showauto = new JPanel();
    JButton back, sell;
    Clientconnetc clientconnetc = new Clientconnetc();
    int t,t1;
    int id1[] = new int[999];

    public Showauto2() {


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
        collum2.setSize(60, 30);
        collum2.setLocation(70, 10);
        collum2.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(collum2);

        hatch = new JLabel("|");
        hatch.setSize(5, 30);
        hatch.setLocation(130, 10);
        hatch.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(hatch);

        collum3 = new JLabel("год выпуска");
        collum3.setSize(105, 30);
        collum3.setLocation(135, 10);
        collum3.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(collum3);

        hatch = new JLabel("|");
        hatch.setSize(5, 30);
        hatch.setLocation(245, 10);
        hatch.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(hatch);

        collum3 = new JLabel("цена");
        collum3.setSize(100, 30);
        collum3.setLocation(250, 10);
        collum3.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(collum3);

        hatch = new JLabel("|");
        hatch.setSize(5, 30);
        hatch.setLocation(350, 10);
        hatch.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(hatch);

        collum3 = new JLabel("статус");
        collum3.setSize(70, 30);
        collum3.setLocation(355, 10);
        collum3.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(collum3);

        hatch = new JLabel("|");
        hatch.setSize(5, 30);
        hatch.setLocation(445, 10);
        hatch.setFont(new Font("Serif", Font.PLAIN, 20));
        showauto.add(hatch);



        String st = null;


        for (t = 0; t < show.i; t++) {
            if(show.statm[t]==1) {
                id1[t1]=show.idm[t];
                hatch = new JLabel("|");
                hatch.setSize(5, 30);
                hatch.setLocation(25, 30 + (20 * t1));
                hatch.setFont(new Font("Serif", Font.PLAIN, 20));
                showauto.add(hatch);

                collum1 = new JLabel("" + show.idm[t]);
                collum1.setSize(30, 30);
                collum1.setLocation(30, 30 + (20 * t1));
                collum1.setFont(new Font("Serif", Font.PLAIN, 20));
                showauto.add(collum1);

                hatch = new JLabel("|");
                hatch.setSize(5, 30);
                hatch.setLocation(65, 30 + (20 * t1));
                hatch.setFont(new Font("Serif", Font.PLAIN, 20));
                showauto.add(hatch);

                collum2 = new JLabel("" + show.markm[t]);
                collum2.setSize(60, 30);
                collum2.setLocation(70, 30 + (20 * t1));
                collum2.setFont(new Font("Serif", Font.PLAIN, 20));
                showauto.add(collum2);

                hatch = new JLabel("|");
                hatch.setSize(5, 30);
                hatch.setLocation(130, 30 + (20 * t1));
                hatch.setFont(new Font("Serif", Font.PLAIN, 20));
                showauto.add(hatch);

                collum3 = new JLabel("" + show.agem[t]);
                collum3.setSize(105, 30);
                collum3.setLocation(135, 30 + (20 * t1));
                collum3.setFont(new Font("Serif", Font.PLAIN, 20));
                showauto.add(collum3);

                hatch = new JLabel("|");
                hatch.setSize(5, 30);
                hatch.setLocation(245, 30 + (20 * t1));
                hatch.setFont(new Font("Serif", Font.PLAIN, 20));
                showauto.add(hatch);

                collum3 = new JLabel("" + show.pricem[t]);
                collum3.setSize(100, 30);
                collum3.setLocation(250, 30 + (20 * t1));
                collum3.setFont(new Font("Serif", Font.PLAIN, 20));
                showauto.add(collum3);

                hatch = new JLabel("|");
                hatch.setSize(5, 30);
                hatch.setLocation(350, 30 + (20 * t1));
                hatch.setFont(new Font("Serif", Font.PLAIN, 20));
                showauto.add(hatch);

                if (show.statm[t] == 0) {
                    st = "Доступно";
                }
                if (show.statm[t] == 1)
                    st = "Заказано";

                collum3 = new JLabel("" + st);
                collum3.setSize(90, 30);
                collum3.setLocation(355, 30 + (20 * t1));
                collum3.setFont(new Font("Serif", Font.PLAIN, 20));

                showauto.add(collum3);

                hatch = new JLabel("|");
                hatch.setSize(30, 30);
                hatch.setLocation(445, 30 + (20 * t1));
                hatch.setFont(new Font("Serif", Font.PLAIN, 20));
                showauto.add(hatch);


                t1++;
            }
        }
        setSize(550, (t1*20)+300);

        info =  new JLabel("Введите id для одобрения"   );
        info.setSize(200,30);
        info.setLocation(50,(t1*20)+100);
        showauto.add(info);

        id =  new JTextField();
        id.setSize(200,30);
        id.setLocation(270,(t1*20)+100);
        showauto.add(id);


        sell =  new JButton("Одобрить");
        sell.setSize(200,30);
        sell.setLocation(50,(t1*20)+150);
        showauto.add(sell);

        back =  new JButton("Назад");
        back.setSize(200,30);
        back.setLocation(270,(t1*20)+150);
        showauto.add(back);

        back.addActionListener(new Butback());
        sell.addActionListener(new Butsell());

        setContentPane(showauto);


    }

    public  class Butback implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == back )
            {


                try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(1);
                    clientconnetc.Closesocket();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

                dispose();
                MenuAdmin menuAdmin= new MenuAdmin();
                menuAdmin.setVisible(true);
            }
        }
    }

    public  class Butsell implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == sell )
            {

                int number=0;

                try {



                    number = Integer.parseInt(id.getText());


                } catch(NumberFormatException e1) {

                    try {
                        clientconnetc.Clientconnetc();
                        clientconnetc.coos.writeObject(1);
                        clientconnetc.Closesocket();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                    dispose();
                    JFrame admin = new Error(1);
                    admin.setVisible(true);

                }
                int count=0;

                for(int i=0;i<t1;i++)
                {

                    if(number==id1[i])
                        count++;
                }
             if (count==0)
             {
                 try {
                     clientconnetc.Clientconnetc();
                     clientconnetc.coos.writeObject(1);
                     clientconnetc.Closesocket();
                 } catch (IOException ioException) {
                     ioException.printStackTrace();
                 }
                 dispose();
                 JFrame admin = new Error(1);
                 admin.setVisible(true);

             }

             else{
                 try {
                     clientconnetc.Clientconnetc();
                     clientconnetc.coos.writeObject(2);
                     clientconnetc.coos.writeObject(number);
                     clientconnetc.Closesocket();
                 } catch (IOException ioException) {
                     ioException.printStackTrace();
                 }

                dispose();
                JFrame success= new Success(1);
                success.setVisible(true);
                }
            }
        }
    }

}