import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MenuClient extends JFrame {

    Clientconnetc clientconnetc =new Clientconnetc();

    JPanel clientmenu = new JPanel();
    JButton butshowauto, butsortauto, butsearchauto, butdeleteuser, butback, butbuyauto, butnewpass;
    public MenuClient()
    {

        super("Регистрация нового клиента");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        clientmenu .setLayout(null);
        setLocation(700,200);
        setSize(500, 500);

        butshowauto =    new JButton("1)Просмотр автомобилей ");
        butsortauto =    new JButton("2)Сортировка автомобилей по параметрам");
        butsearchauto =  new JButton("3)Поиск автомобиля по марке");
        butbuyauto =     new JButton("4)Покупка автомобиля");
        butnewpass =     new JButton("5)Изменить пароль");
        butdeleteuser =  new JButton("6)Удалить пользователя");
        butback =        new JButton("7)Выйти ");

        butshowauto.setSize(300,30);
        butshowauto.setLocation(100,50);

        butsortauto.setSize(300,30);
        butsortauto.setLocation(100,100);

        butsearchauto.setSize(300,30);
        butsearchauto.setLocation(100,150);

        butbuyauto.setSize(300,30);
        butbuyauto.setLocation(100,200);

        butnewpass.setSize(300,30);
        butnewpass.setLocation(100,250);

        butdeleteuser.setSize(300,30);
        butdeleteuser.setLocation(100,300);

        butback.setSize(300,30);
        butback.setLocation(100,350);

        clientmenu.add(butshowauto);
        clientmenu.add(butsortauto);
        clientmenu.add(butsearchauto);
        clientmenu.add(butbuyauto);
        clientmenu.add(butnewpass);
        clientmenu.add(butdeleteuser);
        clientmenu.add(butback);

        Client client = new Client();



          butshowauto.addActionListener(new ButShowauto());
          butsortauto.addActionListener(new Butsortauto());
          butsearchauto.addActionListener(new Butsearch());
          butbuyauto.addActionListener(new Buy());
          butnewpass.addActionListener(new Butnewpass());
          butdeleteuser.addActionListener(new Butdeleteuser());
          butback.addActionListener(new Butback());

          setContentPane(clientmenu);

    }

    public  class ButShowauto implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == butshowauto) {
                try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(1);
                    clientconnetc.Closesocket();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                dispose();
                JFrame show = new Showautoforclient();
               show.setVisible(true);
            }
        }
    }

    public  class Butsortauto implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == butsortauto) {
                try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(2);
                    clientconnetc.Closesocket();
                    dispose();
                    JFrame sortauto = new Sortautoforuser();
                    sortauto.setVisible(true);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }
    }

    public  class Butsearch implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == butsearchauto) {
                try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(3);
                    clientconnetc.Closesocket();
                    dispose();
                    JFrame poiskmark = new Searchforuser();
                    poiskmark.setVisible(true);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
        }
    }

    public  class Buy implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == butbuyauto) {
                try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(4);
                    clientconnetc.Closesocket();
                    dispose();
                    JFrame poiskmark = new Buyauto();
                    poiskmark.setVisible(true);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
        }
    }

    public  class Butnewpass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == butnewpass) {

                dispose();
                JFrame show = new Clientnewpass();
                show.setVisible(true);
            }
        }
    }

    public  class Butdeleteuser implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == butdeleteuser) {
                dispose();
                JFrame dys = new Deleteyourself();
                dys.setVisible(true);
            }
        }
    }

    public  class Butback implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == butback) {


                try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(7);
                    clientconnetc.Closesocket();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                dispose();
                JFrame menu = new Authorization();
                menu.setVisible(true);
            }
        }
    }
}
