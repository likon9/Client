import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Sortautoforuser extends JFrame {
    Clientconnetc clientconnetc = new Clientconnetc();

    JPanel sortauto = new JPanel();
    JButton price, age, back;

    public Sortautoforuser() {
        super("Пробное окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        sortauto.setLayout(null);
        setLocation(700, 200);
        setSize(500, 500);

        price = new JButton("Сортировка по цене");
        age = new JButton("Сортировка по году выпуска");
        back = new JButton("Назад");

        price.setSize(220, 30);
        price.setLocation(150, 100);
        age.setSize(220, 30);
        age.setLocation(150, 150);
        back.setSize(220, 30);
        back.setLocation(150, 200);

        sortauto.add(price);
        sortauto.add(age);
        sortauto.add(back);

        price.addActionListener(new Price());
        age.addActionListener(new Age());
        back.addActionListener(new Back());

        setContentPane(sortauto);

    }

    public class Price implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == price) {
                try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(2);

                    clientconnetc.Closesocket();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

                dispose();
                JFrame testWindow = new Showautosort2(2);

                testWindow.setVisible(true);
            }
        }
    }

    public class Age implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == age) {
                try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(3);

                    clientconnetc.Closesocket();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

                dispose();
                JFrame testWindow = new Showautosort2(3);
                testWindow.setVisible(true);
            }
        }
    }

    public class Back implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == back) {
                try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(1);
                    clientconnetc.Closesocket();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                dispose();
                JFrame testWindow = new MenuClient();
                testWindow.setVisible(true);
            }
        }
    }


}
