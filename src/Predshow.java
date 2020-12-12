import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Predshow extends JFrame  {
    Clientconnetc clientconnetc = new Clientconnetc();
    JPanel panel=new JPanel();
    Double coefm[] = new  Double[11];
    Double c,c1;
    JLabel q;
    JButton back;
    public Predshow(){}
    public Predshow(int t)
    {
        super("Пробное окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel.setLayout(null);
        setLocation(700,200);
        setSize(500, 600);

        Accept accept = new Accept();
        try {
            accept.Accept();
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
        c1 = Double.parseDouble(accept.markm[0]);
        c = t/c1;

        q = new JLabel("Месяц");
        q.setSize(70, 30);
        q.setLocation(100, 20);
        q.setFont(new Font("Serif", Font.PLAIN, 20));
        panel.add(q);

        q = new JLabel("Предпологаемые продажи");
        q.setSize(250, 30);
        q.setLocation(200, 20);
        q.setFont(new Font("Serif", Font.PLAIN, 20));
        panel.add(q);

       for(int i = 0;i<12;i++)
       {

           q = new JLabel(accept.monthm[i]);
           q.setSize(100, 30);
           q.setLocation(100, 60+(30*i));
           panel.add(q);

           c1 = Double.parseDouble(accept.markm[i]);
           int res = (int)(c1*c);
           q = new JLabel(String.valueOf(res));
           q.setSize(50, 30);
           q.setLocation(300, 60+(30*i));
           panel.add(q);
       }

        back = new JButton("Назад");
        back.setSize(200, 30);
        back.setLocation(150, 450);
        panel.add(back);

        back.addActionListener(new Butback());


        setContentPane(panel);


    }
    public  class Butback implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == back )
            {

                dispose();
                JFrame menuclient1 = new MenuAdmin();
                menuclient1.setVisible(true);

            }
        }
    }



}
