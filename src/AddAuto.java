import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class AddAuto extends JFrame {
 Clientconnetc clientconnetc = new Clientconnetc();
    JPanel add = new JPanel();
    JTextField tprice;
    JButton butadd, butback;
    JComboBox box_1, box_2;
    Object boxA, boxB;
    static String[] Mark = {"toyota", "volkswagen", "ford", "honda", "nissan", "hyundai", "chevrolet", "suzuki", "mercedes-benz", "kia", "renault", "BMW", "audi", "peugeot", "fiat", "mazda", "jeep", "skoda", "subaru", "citroen", "opel", "wuling"};
    static String[] Age = {"2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020"};

    public AddAuto() {
        super("Пробное окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add.setLayout(null);
        setLocation(700, 200);
        setSize(500, 500);

        box_1 = new JComboBox(Mark);
        box_2 = new JComboBox(Age);

        box_1 = new JComboBox(Mark);
        box_2 = new JComboBox(Age);
        tprice = new JTextField(null);
        butadd = new JButton("Добавить");
        butback = new JButton("Назад");

        box_1.setSize(70, 25);
        box_1.setLocation(90, 70);
        box_2.setSize(70, 25);
        box_2.setLocation(170, 70);
        tprice.setSize(100, 25);
        tprice.setLocation(250, 70);
        butadd.setSize(150, 25);
        butadd.setLocation(66, 370);
        butback.setSize(150, 25);
        butback.setLocation(283, 370);

        add.add(box_1);
        add.add(box_2);
        add.add(tprice);
        add.add(butadd);
        add.add(butback);


        setContentPane(add);

        butadd.addActionListener(new addauto());
        box_1.addActionListener(new BoxActionListener());
        box_2.addActionListener(new BoxActionListener());
        butback.addActionListener(new back());
    }

    public class addauto implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == butadd) {
                System.out.println("кнопка работает");
                String mark;
                String age ="2000";
                if(boxA==null)
                {
                    mark = "Toyota";
                }
                else mark= String.valueOf(boxA);
                if(boxB==null)
                {
                    age = "2000";
                }
                else age= String.valueOf(boxB);
                int number;
                try {

                    number = Integer.parseInt(tprice.getText());


                } catch(NumberFormatException ex) {
                    number=-1;

                }
                try {
                    clientconnetc.Clientconnetc();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                if(number<500 || number>10000000)
                    {
                        try {
                            clientconnetc.coos.writeObject(2);
                            clientconnetc.Closesocket();
                            dispose();
                            JFrame atry = new Error(1);
                            atry.setVisible(true);
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        }
                    }
                    else {
                        try {
                            clientconnetc.coos.writeObject(1);
                            clientconnetc.coos.writeObject(mark);
                            clientconnetc.coos.writeObject(age);
                            clientconnetc.coos.writeObject(number);
                            clientconnetc.Closesocket();
                            dispose();
                            JFrame atry = new Success(1);
                            atry.setVisible(true);
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        }
                    }
                }
            }
        }

    public class BoxActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == box_1){
                boxA = box_1.getSelectedItem();
            }
            if(e.getSource() == box_2){
                boxB= box_2.getSelectedItem();
            }
            }
        }

    public  class back implements ActionListener{
        public void actionPerformed(ActionEvent e)  {
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
                MenuAdmin menuAdmin= new MenuAdmin();
                menuAdmin.setVisible(true);
            }
        }
    }
    }

