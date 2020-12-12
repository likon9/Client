import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MenuAdmin extends JFrame {
    int i =0;
    Clientconnetc clientconnetc = new Clientconnetc();
    JButton butshowauto, butaddauto, butchangeauto, butdeleteauto, butsortauto,
            butsearchauto, butshowusers, butadduser, butdeleteuser, butchangeuser,
            butapprove, butnewadminpass, butback, butpredaction;
    public  MenuAdmin(){
        super("Пробное окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel menuadmin = new JPanel();
        menuadmin.setLayout(null);
        setLocation(700,200);
        setSize(500, 500);

        butshowauto =    new JButton("1)Просмотр автомобилей");
        butaddauto =     new JButton("2)Добавить новый автомобиль");
        butchangeauto =  new JButton("3)Изменить данные о автомобиле");
        butdeleteauto =  new JButton("4)Удалить данные о автомобиле");
        butsortauto =    new JButton("5)Сортировка автомобиля по параметрам");
        butsearchauto =  new JButton("6)Поиск автомобиля по марке");
        butshowusers =   new JButton("7)Просмотр данных пользователей");
        butadduser =     new JButton("8)Добавить нового пользователя");
        butdeleteuser =  new JButton("9)Удалить пользователя");
        butchangeuser =  new JButton("10)Изменить данные о пользователе");
        butapprove =     new JButton("11)Продажа автомобиля");
        butnewadminpass= new JButton("12)Изменить пароль администратора");
        butback =        new JButton("14)Выйти");
        butpredaction =  new JButton("13)Прогноз");

        butshowauto.setSize(280,20);
        butshowauto.setLocation(100,30);

        butaddauto.setSize(280,20);
        butaddauto.setLocation(100,55);

        butchangeauto.setSize(280,20);
        butchangeauto.setLocation(100,80);

        butdeleteauto.setSize(280,20);
        butdeleteauto.setLocation(100,105);

        butsortauto.setSize(280,20);
        butsortauto.setLocation(100,130);

        butsearchauto.setSize(280,20);
        butsearchauto.setLocation(100,155);

        butshowusers.setSize(280,20);
        butshowusers.setLocation(100,180);

        butadduser.setSize(280,20);
        butadduser.setLocation(100,205);

        butdeleteuser.setSize(280,20);
        butdeleteuser.setLocation(100,230);

        butchangeuser.setSize(280,20);
        butchangeuser.setLocation(100,255);

        butapprove.setSize(280,20);
        butapprove.setLocation(100,280);

        butnewadminpass.setSize(280,20);
        butnewadminpass.setLocation(100,305);

        butpredaction.setSize(280,20);
        butpredaction.setLocation(100,330);

        butback.setSize(280,20);
        butback.setLocation(100,355);

        menuadmin.add(butshowauto);
        menuadmin.add(butaddauto);
        menuadmin.add(butchangeauto);
        menuadmin.add(butdeleteauto);
        menuadmin.add(butsortauto);
        menuadmin.add(butsearchauto);
        menuadmin.add(butshowusers);
        menuadmin.add(butadduser);
        menuadmin.add(butdeleteuser);
        menuadmin.add(butchangeuser);
        menuadmin.add(butapprove);
        menuadmin.add(butnewadminpass);
        menuadmin.add(butback);
        menuadmin.add(butpredaction);



        butshowauto.addActionListener(new but1());
        butaddauto.addActionListener(new but2());
        butchangeauto.addActionListener(new but3());
        butdeleteauto.addActionListener(new but4());
        butsortauto.addActionListener(new but5());
        butsearchauto.addActionListener(new but6());
        butshowusers.addActionListener(new but7());
        butadduser.addActionListener(new but8());
        butdeleteuser.addActionListener(new but9());
        butchangeuser.addActionListener(new but10());
        butapprove.addActionListener(new but11());
        butnewadminpass.addActionListener(new but12());
        butpredaction.addActionListener(new but13());
        butback.addActionListener(new but14());

        setContentPane(menuadmin);
}

    public  class but1 implements ActionListener{
        public void actionPerformed(ActionEvent e)  {
            if(e.getSource() == butshowauto )
            {
                try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(1);
                    clientconnetc.Closesocket();
                    dispose();
                    JFrame sherchshow = new Showauto();
                    sherchshow.setVisible(true);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }


            }
        }
    }

    public  class but2 implements ActionListener{
        public void actionPerformed(ActionEvent e)  {
            if(e.getSource() == butaddauto )
            {
                try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(2);
                    clientconnetc.Closesocket();
                    dispose();
                    JFrame addauto = new AddAuto();
                    addauto.setVisible(true);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }
    }

    public  class but3 implements ActionListener{
        public void actionPerformed(ActionEvent e)  {
            if(e.getSource() == butchangeauto )
            {
                try {
                clientconnetc.Clientconnetc();
                clientconnetc.coos.writeObject(3);
                clientconnetc.Closesocket();
                dispose();
                JFrame changeauto = new change();
                changeauto.setVisible(true);

            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            }
        }
    }

    public  class but4 implements ActionListener{
        public void actionPerformed(ActionEvent e)  {
            if(e.getSource() == butdeleteauto )
            {  try {
                clientconnetc.Clientconnetc();
                clientconnetc.coos.writeObject(4);
                dispose();
                JFrame deleteauto = new Deleteauto();
                deleteauto.setVisible(true);
                clientconnetc.Closesocket();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            }
        }
    }

    public  class but5 implements ActionListener{
        public void actionPerformed(ActionEvent e)  {
            if(e.getSource() == butsortauto )
            {  try {
                clientconnetc.Clientconnetc();
                clientconnetc.coos.writeObject(5);
                clientconnetc.Closesocket();
                dispose();
                JFrame sortauto = new Sortauto();
                sortauto.setVisible(true);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            }
        }
    }

    public  class but6 implements ActionListener{
        public void actionPerformed(ActionEvent e)  {
            if(e.getSource() == butsearchauto )
            {
                try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(6);
                    clientconnetc.Closesocket();
                    dispose();
                    JFrame poiskmark = new Search();
                    poiskmark.setVisible(true);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }
    }

    public  class but7 implements ActionListener{
        public void actionPerformed(ActionEvent e)  {
            if(e.getSource() == butshowusers )
            {
                try {

                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(7);
                    clientconnetc.Closesocket();
                    dispose();
                    JFrame show = new ShowusersJ();
                    show.setVisible(true);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }
    }

    public  class but8 implements ActionListener{
        public void actionPerformed(ActionEvent e)  {
            if(e.getSource() == butadduser )
            {  try {
                clientconnetc.Clientconnetc();
                clientconnetc.coos.writeObject(8);
                clientconnetc.Closesocket();
                dispose();
                JFrame add = new Addnewuser();
                add.setVisible(true);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            }
        }
    }

    public  class but9 implements ActionListener{
        public void actionPerformed(ActionEvent e)  {
            if(e.getSource() == butdeleteuser )
            {  try {
                clientconnetc.Clientconnetc();
                clientconnetc.coos.writeObject(9);
                clientconnetc.Closesocket();
                dispose();
                JFrame show = new Deleteuser();
                show.setVisible(true);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            }
        }
    }

    public  class but10 implements ActionListener{
        public void actionPerformed(ActionEvent e)  {
            if(e.getSource() == butchangeuser )
            {
                try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(10);
                    clientconnetc.Closesocket();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                dispose();
                JFrame testWindow = new Changeuser();
                testWindow.setVisible(true);
            }
        }
    }

    public  class but11 implements ActionListener{
        public void actionPerformed(ActionEvent e)  {
            if(e.getSource() == butapprove )
            {   try {
                clientconnetc.Clientconnetc();
                clientconnetc.coos.writeObject(11);
                clientconnetc.Closesocket();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
                dispose();
                JFrame testWindow = new Showauto2();
                testWindow.setVisible(true);

            }
        }
    }

    public  class but12 implements ActionListener{
        public void actionPerformed(ActionEvent e)  {
            if(e.getSource() == butnewadminpass )
            {  try {
                clientconnetc.Clientconnetc();
                clientconnetc.coos.writeObject(12);
                clientconnetc.Closesocket();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
                dispose();
                JFrame testWindow = new Newpassadmin();
                testWindow.setVisible(true);
            }
        }
    }

    public  class but13 implements ActionListener{
        public void actionPerformed(ActionEvent e)  {
            if(e.getSource() == butpredaction )
            {
                try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(13);
                    clientconnetc.Closesocket();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

                dispose();
               JFrame testWindow = new Predactoin();
               testWindow.setVisible(true);
            }
        }
    }

    public  class but14 implements ActionListener{
        public void actionPerformed(ActionEvent e)  {
            if(e.getSource() == butback )
            {
                try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(14);
                    clientconnetc.Closesocket();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

                dispose();
                JFrame testWindow = new Authorization();
                testWindow.setVisible(true);
            }
        }
    }



}
