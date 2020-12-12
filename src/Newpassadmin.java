import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Newpassadmin extends JFrame {

    JButton butnewpass, butback;
    JLabel enternewpass;
    JTextField newpass;


    public Newpassadmin(){
        super("Пробное окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel newpassadmin = new JPanel();
        newpassadmin.setLayout(null);
        setLocation(700,200);
        setSize(500,500);

        enternewpass = new JLabel("Введите новый пароль");
        newpass = new JTextField();
        butnewpass = new JButton("Изменить");
        butback = new JButton("Назад");

        enternewpass.setSize(1500,30);
        enternewpass.setLocation(50,100);
        newpass.setSize(100,30);
        newpass.setLocation(260,100);
        butnewpass.setSize(200,30);
        butnewpass.setLocation(30,250);
        butback.setSize(200,30);
        butback.setLocation(260,250);

        newpassadmin.add(enternewpass);
        newpassadmin.add(newpass);
        newpassadmin.add(butback);
        newpassadmin.add(butnewpass);

        butback.addActionListener(new Bback());
        butnewpass.addActionListener(new Bnewpass());

        setContentPane(newpassadmin);

    }

    public  class Bback implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == butback )
            {
                Clientconnetc clientconnetc = new Clientconnetc();

                try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(1);
                    clientconnetc.Closesocket();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

                JFrame testWindow = new MenuAdmin();
                testWindow.setVisible(true);
                dispose();
            }
        }
    }
    public  class Bnewpass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == butnewpass )
            {
                String str = newpass.getText();
                int count = 0;
                for(int i = 0; i<str.length(); i++) {
                    count++;
                }
                System.out.println(count);

                Clientconnetc clientconnetc = new Clientconnetc();

                if (count<4){
                try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(1);
                    clientconnetc.Closesocket();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                }
                else {
                    try {
                        clientconnetc.Clientconnetc();
                        clientconnetc.coos.writeObject(2);
                        clientconnetc.coos.writeObject(str);
                        clientconnetc.Closesocket();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                    dispose();
                    JFrame success = new Success(1);
                    success.setVisible(true);

                }

                JFrame testWindow = new MenuAdmin();
                testWindow.setVisible(true);
                dispose();
            }
        }
    }
}
