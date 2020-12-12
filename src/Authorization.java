import sun.applet.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;



public class Authorization extends JFrame{
JButton butadmin, butclient, butend;
    JPanel autorization = new JPanel();

    public Authorization(){

        super("Пробное окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        autorization.setLayout(null);
        setLocation(700,200);
        setSize(500, 500);

        butadmin = new JButton("Вход от имени администратора");
        butclient = new JButton(" Вход от имени клиента");
        butend = new JButton("Выход");

        butadmin.setSize(230,40);
        butadmin.setLocation(135,100);

        butclient.setSize(230,40);
        butclient.setLocation(135,160);

        butend.setSize(230,40);
        butend.setLocation(135,229);

        autorization.add(butadmin);
        autorization.add(butclient);
        autorization.add(butend);

        butadmin.addActionListener(new Butadmin());
        butclient.addActionListener(new Butclient());
        butend.addActionListener(new Butend());

        setContentPane(autorization);

    }

    public  class Butadmin implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == butadmin )
            {
                JFrame testWindow = new Admin();
                testWindow.setVisible(true);
                autorization.setVisible(false);
                dispose();
            }
        }
    }

    public  class Butclient implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == butclient )
            {
                JFrame testWindow = new Client();
                testWindow.setVisible(true);
                autorization.setVisible(false);
                dispose();
            }
        }
    }

    public  class Butend implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == butend)
            {
                Clientconnetc clientconnetc = new Clientconnetc();
                try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(4);
                    clientconnetc.Closesocket();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

                dispose();
            }
        }
    }

}
