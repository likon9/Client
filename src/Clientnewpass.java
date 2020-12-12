import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Clientnewpass extends JFrame {

    Clientconnetc clientconnetc = new Clientconnetc();
    JPanel del = new JPanel();
    JLabel text;
    JButton butback, butdel;
    JTextField tnewpass;

    public Clientnewpass()
    {
        super("Изменение пароля");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        del.setLayout(null);
        setLocation(700,200);
        setSize(500, 500);

        butback = new JButton("Назад");
        butdel = new JButton("Изменить");
        text = new JLabel("Введите новы пароль(не менее 4-х символов?");
        tnewpass = new JTextField("");

        text.setSize(300,30);
        text.setLocation(100,100);

        tnewpass.setSize(100,30);
        tnewpass.setLocation(200,150);

        butdel.setSize(150,30);
        butdel.setLocation(75,250);

        butback.setSize(150,30);
        butback.setLocation(275,250);

        del.add(text);
        del.add(butdel);
        del.add(butback);
        del.add(tnewpass);

        butback.addActionListener(new Butback());
        butdel.addActionListener(new Butdel());

        setContentPane(del);
    }

    public  class Butback implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == butback) {
                dispose();
                JFrame menuc = new MenuClient();
                menuc.setVisible(true);
            }
        }
    }

    public  class Butdel implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == butdel) {

                    String pass = tnewpass.getText();
                    int count =0;
                    for(int i=0;i<pass.length();i++)
                    {
                        count++;
                    }
                    if(count<4)
                    {
                        dispose();
                        JFrame admin = new Error(2);
                        admin.setVisible(true);
                    }else{
                        try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(5);
                    clientconnetc.coos.writeObject(pass);
                    clientconnetc.Closesocket();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                        dispose();
                        JFrame menuclient1 = new Success(2);
                        menuclient1.setVisible(true);
                    }

            }
        }
    }
}