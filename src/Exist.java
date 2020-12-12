import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exist extends JFrame {

    JPanel panel = new JPanel();
    JLabel jl;
    JButton butback;
    int q;


    public Exist(){

        super("Пробное окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel.setLayout(null);
        setLocation(700,200);
        setSize(500, 500);



        jl= new JLabel("Пользователь с данным логином существет");
        jl.setSize(400, 50);
        jl.setLocation(50, 100);
        jl.setFont(new Font("Serif", Font.PLAIN, 20));
        panel.add(jl);

        butback = new JButton("Продолжить");
        butback.setSize(200,50);
        butback.setLocation(150, 250);
        butback.setFont(new Font("Serif", Font.PLAIN, 20));
        panel.add(butback);

        butback.addActionListener(new Butback());

        setContentPane(panel);
    }

    public  class Butback implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == butback) {





                    dispose();
                    JFrame menuc = new Clientregistration();
                    menuc.setVisible(true);



            }
        }
    }



}
