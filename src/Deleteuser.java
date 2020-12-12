import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Deleteuser extends JFrame {

    JLabel  collum1, collum2, collum3, hatch, iddel;
    JButton butdel, butback;
    JTextField id;
    JPanel showauto = new JPanel();
    JButton back;
    int r=0;
    int idm[]= new int[999];

    Clientconnetc clientconnetc = new Clientconnetc();

    public Deleteuser() {


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

            r++;
            idm[t]=showusers.idm[t];
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

        iddel =  new JLabel("Введите id пользователя, которого хотите удалить");
        iddel.setSize(300,30);
        iddel.setLocation(75,(t*20)+100);
        showauto.add(iddel);

        id =  new JTextField();
        id.setSize(50,30);
        id.setLocation(375,(t*20)+100);
        showauto.add(id);

        butdel =  new JButton("Удалить");
        butdel.setSize(150,30);
        butdel.setLocation(75,(t*20)+150);
        showauto.add(butdel);

        butback =  new JButton("Назад");
        butback.setSize(150,30);
        butback.setLocation(275,(t*20)+150);
        showauto.add(butback);

        butback.addActionListener(new Butback());
        butdel.addActionListener(new Butdel());

        setContentPane(showauto);


    }

    public  class Butback implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == butback )
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

    public  class Butdel implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == butdel )
            {
                int number=0;
                String idfordel = id.getText();
                try {
                    number = Integer.parseInt(idfordel);

                } catch(NumberFormatException e1) {
                    System.out.println("incorrect input");
                }

                int count =0;
                for(int i=0;i<r;i++)
                {
                    if(number==idm[i])
                    {
                        System.out.println(number+" "+idm[i]);
                        count++;
                    }
                }

                try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(2);
                    clientconnetc.coos.writeObject(number);
                    clientconnetc.Closesocket();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

                if(count>0) {
                    dispose();
                    JFrame success = new Success(1);
                    success.setVisible(true);
                }
                else{
                    dispose();
                    JFrame admin = new Error(1);
                    admin.setVisible(true);
                }

            }
        }
    }

}