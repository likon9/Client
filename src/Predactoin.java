import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Predactoin extends JFrame {
    JPanel panel = new JPanel();
    Clientconnetc clientconnetc = new Clientconnetc();

    JButton butback, butpred;
    JTextField t;
    JLabel l;


    public Predactoin()
    {
        super("Пробное окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel.setLayout(null);
        setLocation(700,200);
        setSize(500, 500);



        l = new JLabel("Введите продажи за первый месяц");
        t =  new JTextField();
        butpred = new JButton("Прогноз");
        butback = new JButton("Назад");

        l.setSize(220, 30);
        l.setLocation(50, 100);
        t.setSize(100, 30);
        t.setLocation(300, 100);
        butpred.setSize(175, 30);
        butpred.setLocation(50, 250);
        butback.setSize(175, 30);
        butback.setLocation(260, 250);

        panel.add(l);
        panel.add(t);
        panel.add(butback);
        panel.add(butpred);

        butpred.addActionListener(new B1());
        butback.addActionListener(new B2());

        setContentPane(panel);

    }

   public class B1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == butpred) {

                int number=0;
                try {
                    number = Integer.parseInt(t.getText());
                } catch(NumberFormatException e1) {
                    System.out.println("incorrect input");

                }
                if(number==0){
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
                else {

                    try {
                        clientconnetc.Clientconnetc();
                        clientconnetc.coos.writeObject(2);
                        clientconnetc.Closesocket();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }

                    dispose();
                    JFrame testWindow = new Predshow(number);
                   testWindow.setVisible(true);
                }
            }
        }
    }

    public class B2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == butback) {



                try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(1);
                    clientconnetc.Closesocket();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

                dispose();
                JFrame testWindow = new MenuAdmin();
                testWindow.setVisible(true);
            }
        }
    }
}
