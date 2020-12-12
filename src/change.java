import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class change extends JFrame {

    Clientconnetc clientconnetc=new Clientconnetc();

    JPanel showauto = new JPanel();
    JRadioButton b1,b2,b3;
    JButton back , changeauto;
    JLabel  collum1, collum2, collum3,hatch;
    JLabel lid;
    JTextField tid, newa;
    ButtonGroup rb;
    int k=0;
    Show show = new Show();

    public change() {


        super("Пробное окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        showauto.setLayout(null);
        setLocation(700, 200);



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

        lid =  new JLabel("Введите id");
        lid.setSize(100,30);
        lid.setLocation(180,(t*20)+50);
        showauto.add(lid);

        tid =  new JTextField();
        tid.setSize(160,30);
        tid.setLocation(350,(t*20)+50);
        showauto.add(tid);

        b1 = new JRadioButton("Изменить марку");
        b2 = new JRadioButton("Изменить год выпуска");
        b3 = new JRadioButton("Изменить цену");
        rb = new ButtonGroup();
        rb.add(b1);
        rb.add(b2);
        rb.add(b3);
        b1.setSize(150,15);
        b1.setLocation(150,(t*20)+90);
        b2.setSize(170,15);
        b2.setLocation(150,(t*20)+110);
        b3.setSize(150,15);
        b3.setLocation(150,(t*20)+130);
        showauto.add(b1);
        showauto.add(b2);
        showauto.add(b3);

        newa =  new JTextField();
        newa.setSize(160,30);
        newa.setLocation(350,(t*20)+110);
        showauto.add(newa);

        back =  new JButton("Назад");
        back.setSize(150,30);
        back.setLocation(150,(t*20)+150);
        showauto.add(back);

        changeauto =  new JButton("Выбрать");
        changeauto.setSize(160,30);
        changeauto.setLocation(350,(t*20)+150);
        showauto.add(changeauto);


        b1.addActionListener(new FlagActionListener());
        b2.addActionListener(new FlagActionListener());
        b3.addActionListener(new FlagActionListener());


        back.addActionListener(new Butback());
        changeauto.addActionListener(new Choice());

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
                JFrame menuAdmin= new MenuAdmin();
                menuAdmin.setVisible(true);
            }
        }
    }

    public class FlagActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            k = 0;
            if(e.getSource() == b1){
                k=1;
            }
            else if(e.getSource() == b2){
                k=2;
            }
            else if(e.getSource() == b3){
                k=3;
            }

        }
    }

    public  class Choice implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == changeauto )
            { String nid = tid.getText();
            int number;
                try {
                    number = Integer.parseInt(nid);
    } catch(NumberFormatException ex)
                {
                    number=-1;
                }
                int y=0;
                for (int i=0;i<show.i;i++)
                {
                    if(number==show.idm[i])
                    {
                        y=1;
                    }
                }
                if(y==0)number=-1;
                System.out.println(number);
                if(number==-1)
                {
                    try {
                        clientconnetc.Clientconnetc();
                        clientconnetc.coos.writeObject(1);
                        clientconnetc.Closesocket();
                        dispose();
                        JFrame admin = new Error(1);
                        admin.setVisible(true);

                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }

                }
                else {
                    int arg=0;
                    try {
                        String ch=newa.getText();
                        if(k==1){
                            if(ch.isEmpty())
                                arg=-1;
                        }
                        if(k==2){
                            try {
                                arg = Integer.parseInt(ch);


                            } catch(NumberFormatException e1) {
                                System.out.println("incorrect input");
                                arg=-1;
                            }
                            if(arg>2020||arg<2000)arg=-1;
                        }
                        if(k==3){
                            try {
                                arg = Integer.parseInt(ch);

                            } catch(NumberFormatException e1) {
                                System.out.println("incorrect input");
                                arg=-1;
                            }
                            if(arg<500||arg>100000000)arg=-1;
                        }
                        if(arg==-1 || k==0)
                        {
                            clientconnetc.Clientconnetc();
                            clientconnetc.coos.writeObject(1);
                            clientconnetc.Closesocket();
                            dispose();
                            JFrame admin = new Error(1);
                            admin.setVisible(true);
                        }
                        else {

                            clientconnetc.Clientconnetc();
                            clientconnetc.coos.writeObject(2);
                            clientconnetc.coos.writeObject(number);
                            clientconnetc.coos.writeObject(k);
                            clientconnetc.coos.writeObject(ch);
                            clientconnetc.Closesocket();

                            dispose();
                            JFrame admin = new Success(1);
                            admin.setVisible(true);
                        }


                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }}



            }
        }
    }

}