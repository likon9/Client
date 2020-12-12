import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Deleteyourself extends JFrame {

    Clientconnetc clientconnetc = new Clientconnetc();
    JPanel del = new JPanel();
    JLabel text;
    JButton butback, butdel;

    public Deleteyourself()
    {
        super("Регистрация нового клиента");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        del.setLayout(null);
        setLocation(700,200);
        setSize(500, 500);

        butback = new JButton("Назад");
        butdel = new JButton("Удалить");
        text = new JLabel("Вы точно хотите удалить?");

        text.setSize(200,30);
        text.setLocation(150,100);

        butdel.setSize(150,30);
        butdel.setLocation(75,250);

        butback.setSize(150,30);
        butback.setLocation(275,250);

        del.add(text);
        del.add(butdel);
        del.add(butback);

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
                try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(6);
                    clientconnetc.Closesocket();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                dispose();
                JFrame menuc = new Authorization();
                menuc.setVisible(true);
            }
        }
    }
}
