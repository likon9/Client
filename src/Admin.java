import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.JPasswordField;

public class Admin extends JFrame {
    Clientconnetc clientconnetc = new Clientconnetc();
    JLabel tpassadmin;
    JPasswordField areapassadmin;
    JButton butpassadmin , butback;
    public String passadmin;
    public  Admin(){
        super("Пробное окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel admin = new JPanel();
        admin.setLayout(null);
        setLocation(700,200);
        setSize(500, 500);

        tpassadmin = new JLabel("Пароль админиcтратора");
        areapassadmin = new JPasswordField();
        butpassadmin = new JButton("Войти");
        butback = new JButton("Назад");

        tpassadmin.setSize(150,30);
        tpassadmin.setLocation(30,70);
        areapassadmin.setSize(250,30);
        areapassadmin.setLocation(200,70);
        butpassadmin.setSize(150,30);
        butpassadmin.setLocation(50,300);
        butback.setSize(150,30);
        butback.setLocation(270,300);

        admin.add(tpassadmin);
        admin.add(areapassadmin);
        admin.add(butpassadmin);
        admin.add(butback);

        butpassadmin.addActionListener(new loginadmin());
        butback.addActionListener(new Butback());

        setContentPane(admin);
    }

    public  class Butback implements ActionListener{
        public void actionPerformed(ActionEvent e)  {
            if(e.getSource() == butback )
            {
                dispose();
                JFrame menu= new Authorization();
                menu.setVisible(true);
            }
        }
    }

    public  class loginadmin implements ActionListener{
        public void actionPerformed(ActionEvent e)  {
            if(e.getSource() == butpassadmin )
             {

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
        public  void send()throws IOException
        {
            clientconnetc.Clientconnetc();
            clientconnetc.coos.writeObject(1);
            clientconnetc.coos.writeObject(null);
            clientconnetc.coos.writeObject(String.valueOf(areapassadmin.getPassword()));
        }
        public  void numb() throws  IOException
        {

            int i = 0;
            try {
                i = (int) clientconnetc.cois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            clientconnetc.Closesocket();
            if(i==1){
                dispose();
                JFrame menuAdmin= new MenuAdmin();
                menuAdmin.setVisible(true);
            }
            if(i==2)
            {
                dispose();
                JFrame menuAdmin= new Incorrect(1);
                menuAdmin.setVisible(true);

            }
    }
}



