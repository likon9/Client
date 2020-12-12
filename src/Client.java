import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Client extends JFrame {
    Clientconnetc clientconnetc = new Clientconnetc();
    JLabel tpassclient, tloginclient;
    JPasswordField areapassclient;
    JTextField arealoginclient;
    JButton butclientauto, butnewclient, butback;


    JPanel client = new JPanel();

    public Client(){
        super("Пробное окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        client.setLayout(null);
        setLocation(700,200);
        setSize(500, 500);

        tloginclient= new JLabel("Логин клиента");
        tpassclient = new JLabel("Пароль клиента");
        arealoginclient = new JTextField();
        areapassclient = new JPasswordField();
        butclientauto = new JButton("Войти");
        butnewclient = new JButton(" Регистрация");
        butback = new JButton("Назад");

        tloginclient.setSize(150,30);
        tloginclient.setLocation(30,70);

        tpassclient.setSize(150,30);
        tpassclient.setLocation(30,120);

        arealoginclient.setSize(250,30);
        arealoginclient.setLocation(200,70);

        areapassclient.setSize(250,30);
        areapassclient.setLocation(200,120);

        butclientauto.setSize(200,30);
        butclientauto.setLocation(25,300);

        butnewclient.setSize(200,30);
        butnewclient.setLocation(250,300);

        butback.setSize(425,30);
        butback.setLocation(25,350);

        client.add(tloginclient);
        client.add(tpassclient);
        client.add(arealoginclient);
        client.add(areapassclient);
        client.add(butclientauto);
        client.add(butnewclient);
        client.add(butback);


        butnewclient.addActionListener(new newclient());
        butclientauto.addActionListener(new loginadmin());
        butback.addActionListener(new backauto());

        setContentPane(client);
    }


    public class backauto implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == butback)
            {
                dispose();
                JFrame testWindow = new Authorization();
                testWindow.setVisible(true);
            }
        }
    }

    public class newclient implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == butnewclient ){
                JFrame testWindow = new Clientregistration();
                testWindow.setVisible(true);
                client.setVisible(false);
                dispose();
            }
        }}

    public  class loginadmin implements ActionListener{
        public void actionPerformed(ActionEvent e)  {
            if(e.getSource() == butclientauto )
            {
                try {
                    send();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                try {
                    numb();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
         }

        }
        public  void send()throws IOException
        {

            clientconnetc.Clientconnetc();
            clientconnetc.coos.writeObject(2);
            clientconnetc.coos.writeObject(arealoginclient.getText());
            clientconnetc.coos.writeObject(String.valueOf(areapassclient.getPassword()));
        }
    }
    public  void numb() throws  IOException
    {

        int i = 0;
        try {
            i = (int) clientconnetc.cois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        clientconnetc.Closesocket();
        if(i==1){
            dispose();
            JFrame qwe = new MenuClient();
            qwe.setVisible(true);
        }
        if(i==2)
        {
            dispose();
            JFrame client2 = new Incorrect(2);
            client2.setVisible(true);


        }
    }


}
