import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Searchforuser extends JFrame {
    JTextField tmark;
    JLabel  addmark;
    JButton butback, butsearch;
    Clientconnetc clientconnetc = new Clientconnetc();
    JPanel search = new JPanel();
    public Searchforuser()
    {

        super("Пробное окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        search.setLayout(null);
        setLocation(700, 200);
        setSize(500, 500);

        addmark = new JLabel("Введите название интересующей вас марки");
        addmark.setSize(270, 30);
        addmark.setLocation(30, 100);
        tmark = new JTextField();
        tmark.setSize(100, 30);
        tmark.setLocation(310, 100);
        butsearch = new JButton("Поиск");
        butsearch.setSize(150, 30);
        butsearch.setLocation(66, 270);
        butback = new JButton("Назад");
        butback.setSize(150, 30);
        butback.setLocation(260, 270);


        search.add(addmark);
        search.add(tmark);
        search.add(butsearch);
        search.add(butback);

        butsearch.addActionListener(new Butsearch());
        butback.addActionListener(new Butback());

        setContentPane(search);
    }
    public  class Butsearch implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == butsearch )
            {
                try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(1);
                    clientconnetc.Closesocket();

                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                String mark = null;
                mark = tmark.getText();

                dispose();
                JFrame searchshow= new Searchshow2(mark);
                searchshow.setVisible(true);
            }
        }
    }
    public  class Butback implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == butback )
            {
                try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(2);
                    clientconnetc.Closesocket();

                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                dispose();
                JFrame menuAdmin= new MenuClient();
                menuAdmin.setVisible(true);
            }
        }
    }
}
