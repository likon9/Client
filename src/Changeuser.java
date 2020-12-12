import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Changeuser extends JFrame {

    JLabel idl , collum1, collum2, collum3,hatch;
    JTextField idt, arg;
    JPanel showauto = new JPanel();
    JRadioButton b1,b2;
    JButton back , changeuser;
    ButtonGroup rb;
    int k=0;
    Clientconnetc clientconnetc = new Clientconnetc();

    public Changeuser() {


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


        b1 = new JRadioButton("Изменить логин");
        b2 = new JRadioButton("Изменить пароль");

        rb = new ButtonGroup();
        rb.add(b1);
        rb.add(b2);

        idl= new JLabel("Введите id клиента, которого хотите изменить");
        idl.setLocation(50,(t*20)+100);
        idl.setSize(300,15);
        showauto.add(idl);

        idt = new JTextField();
        idt.setLocation(360,(t*20)+100);
        idt.setSize(50,30);
        showauto.add(idt);

        arg = new JTextField();
        arg.setLocation(360,(t*20)+150);
        arg.setSize(50,30);
        showauto.add(arg);

        b1.setSize(150,15);
        b1.setLocation(50,(t*20)+140);
        b2.setSize(170,15);
        b2.setLocation(50,(t*20)+160);

        showauto.add(b1);
        showauto.add(b2);
        changeuser =  new JButton("Изменить");
        changeuser.setSize(150,30);
        changeuser.setLocation( 50,(t*20)+200);

        back =  new JButton("Назад");
        back.setSize(150,30);
        back.setLocation(250,(t*20)+200);
        showauto.add(back);

        showauto.add(changeuser);

        b1.addActionListener(new FlagActionListener());
        b2.addActionListener(new FlagActionListener());



        back.addActionListener(new Butback());
        changeuser.addActionListener(new Butchange());


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

    public  class Butchange implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() ==changeuser )
            {
                String id = idt.getText();
                String arg1 = arg.getText();
                int number;
                try {
                    number = Integer.parseInt(id);
                } catch(NumberFormatException ex)
                {
                    number=-1;
                }
                System.out.println("n="+number);
                int count = 0;
                for(int i = 0; i<arg1.length(); i++) {
                   count++;
                }
                if(count<4)
                {
                 number=-1;
                }
                System.out.println("n="+number);

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
                    System.out.println(number+arg1);
                        if(k==1){

                            try {
                                clientconnetc.Clientconnetc();
                                clientconnetc.coos.writeObject(2);
                                clientconnetc.coos.writeObject(number);
                                clientconnetc.coos.writeObject(arg1);
                                clientconnetc.Closesocket();
                            } catch (IOException ioException) {
                                ioException.printStackTrace();
                            }
                            dispose();
                            JFrame success = new Success(1);
                            success.setVisible(true);

                        }
                        if(k==2){
                            try {
                                clientconnetc.Clientconnetc();
                                clientconnetc.coos.writeObject(3);
                                clientconnetc.coos.writeObject(number);
                                clientconnetc.coos.writeObject(arg1);
                                clientconnetc.Closesocket();
                            } catch (IOException ioException) {
                                ioException.printStackTrace();
                            }
                            dispose();
                            JFrame success = new Success(1);
                            success.setVisible(true);

                        }
                        if(k==0)
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

                        }

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


        }
    }

}