import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Showautosort2 extends JFrame {

    JLabel info, line , collum1, collum2, collum3,hatch;

    JPanel showauto = new JPanel();
    JButton back;

public Showautosort2(){}
    public Showautosort2(int i) {

        super("Пробное окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        showauto.setLayout(null);
        setLocation(700, 200);
        setSize(500, 500);
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

        if(i==2){
            for(int i1 = show.i-1 ; i1 > 0 ; i1--){
                for(int j = 0 ; j < i1 ; j++){

            if( show.pricem[j] > show.pricem[j+1] ){
                int id1 = show.idm[j];
                String mark1 = show.markm[j];
                int age1 = show.agem[j];
                int price1 = show.pricem[j];
                int stat1 = show.statm[j];
                String login = show.loginm[j];

                show.idm[j] = show.idm[j + 1];
                show.markm[j] = show.markm[j + 1];
                show.agem[j] = show.agem[j + 1];
                show.pricem[j] = show.pricem[j + 1];
                show.statm[j] = show.statm[j + 1];
                show.loginm[j] = show.loginm[j + 1];

                show.idm[j + 1] = id1;
                show.markm[j + 1] = mark1;
                show.agem[j + 1] = age1;
                show.pricem[j + 1] = price1;
                show.statm[j + 1] = stat1;
                show.loginm[j + 1] = login;

                System.out.println("сортировка?");

            }
        }
    }
        }
        if(i==3) {
            for (int i1 = show.i - 1; i1 > 0; i1--) {
                for (int j = 0; j < i1; j++) {

                    if (show.agem[j] > show.agem[j + 1]) {
                        int id1 = show.idm[j];
                        String mark1 = show.markm[j];
                        int age1 = show.agem[j];
                        int price1 = show.pricem[j];
                        int stat1 = show.statm[j];
                        String login = show.loginm[j];

                        show.idm[j] = show.idm[j + 1];
                        show.markm[j] = show.markm[j + 1];
                        show.agem[j] = show.agem[j + 1];
                        show.pricem[j] = show.pricem[j + 1];
                        show.statm[j] = show.statm[j + 1];
                        show.loginm[j] = show.loginm[j + 1];

                        show.idm[j + 1] = id1;
                        show.markm[j + 1] = mark1;
                        show.agem[j + 1] = age1;
                        show.pricem[j + 1] = price1;
                        show.statm[j + 1] = stat1;
                        show.loginm[j + 1] = login;

                        System.out.println("сортировка?");

                    }
                }
            }
        }

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
                JFrame menuAdmin= new MenuClient();
                menuAdmin.setVisible(true);
            }
        }
    }

}