import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Clientregistration extends JFrame {
    Clientconnetc clientconnetc = new Clientconnetc();
    JLabel tpassclient, tloginclient;
    JTextField arealoginnewclient, areapassnewclient;
    JButton butaddnewclient, butback;
    public String passnewclient, loginnewclient;
    JPanel client = new JPanel();

    public Clientregistration(){
        super("Регистрация нового клиента");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        client.setLayout(null);
        setLocation(700,200);
        setSize(500, 500);

        tloginclient= new JLabel("Логин клиента");
        tpassclient = new JLabel("Пароль клиента");
        arealoginnewclient = new JTextField();
        areapassnewclient = new JTextField();
        butaddnewclient = new JButton("Зарегестрироваться");
        butback = new JButton("Назад");


        tloginclient.setSize(150,30);
        tloginclient.setLocation(30,70);

        tpassclient.setSize(150,30);
        tpassclient.setLocation(30,120);

        arealoginnewclient.setSize(250,30);
        arealoginnewclient.setLocation(200,70);

        areapassnewclient.setSize(250,30);
        areapassnewclient.setLocation(200,120);

        butaddnewclient.setSize(200,30);
        butaddnewclient.setLocation(30,300);

        butback.setSize(200,30);
        butback.setLocation(270,300);

        client.add(tloginclient);
        client.add(tpassclient);
        client.add(arealoginnewclient);
        client.add(areapassnewclient);
        client.add(butaddnewclient);
        client.add(butback);

        butaddnewclient.addActionListener(new regclient());
        butback.addActionListener(new Butback());

        setContentPane(client);
    }

    public  class Butback implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == butback) {

                dispose();
                JFrame menu = new Authorization();
                menu.setVisible(true);

            }

        }
    }

    public  class regclient implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == butaddnewclient) {
                try {
                    send();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                try {
                    numb();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }


            }

        }
    }

        public void send() throws IOException {
            System.out.println(arealoginnewclient.getText());
            System.out.println(areapassnewclient.getText());


                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(3);
                    clientconnetc.coos.writeObject(arealoginnewclient.getText());
                    clientconnetc.coos.writeObject(areapassnewclient.getText());

                }




        public void numb() throws IOException {

            int i = 0;
            try {

                i = (int) clientconnetc.cois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            clientconnetc.Closesocket();
            if (i == 1) {
                dispose();
                JFrame menu = new Authorization();
                menu.setVisible(true);
            }
            if (i == 2) {
                dispose();
                JFrame clientregistration2 = new Exist();
                clientregistration2.setVisible(true);

            }
        }
    }
