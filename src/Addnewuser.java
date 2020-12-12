import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Addnewuser extends JFrame {

    JLabel lpass, llogin;
    JTextField tlogin, tpass;
    JButton butadd, butback;
    Clientconnetc clientconnetc = new Clientconnetc();


    public Addnewuser()
    {
        super("Пробное окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel addnewuser = new JPanel();
        addnewuser.setLayout(null);
        setLocation(700,200);
        setSize(500, 500);

        llogin = new JLabel("Придумайте логин");
        lpass = new JLabel("Придумайте пароль");
        tlogin = new JTextField();
        tpass = new JTextField();
        butadd = new JButton("Добавить");
        butback = new JButton("Назад");

        llogin.setSize(150,30);
        llogin.setLocation(50,50);

        tlogin.setSize(150,30);
        tlogin.setLocation(250,50);

        lpass.setSize(150,30);
        lpass.setLocation(50,100);

        tpass.setSize(150,30);
        tpass.setLocation(250,100);

        butadd.setSize(150,30);
        butadd.setLocation(50,200);

        butback.setSize(150,30);
        butback.setLocation(250,200);

        addnewuser.add(llogin);
        addnewuser.add(lpass);
        addnewuser.add(tlogin);
        addnewuser.add(tpass);
        addnewuser.add(butadd);
        addnewuser.add(butback);

        butadd.addActionListener(new Butadd());
        butback.addActionListener(new Butback());
        setContentPane(addnewuser);
    }

    public  class Butback implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == butback )
            {
                try {
                    clientconnetc.Clientconnetc();
                    clientconnetc.coos.writeObject(1);
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

    public  class Butadd implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == butadd )
            {
                int p=0;
                String login = tlogin.getText();
                String pass = tpass.getText();

                int count1 = 0;
                for(int i = 0; i<login.length(); i++) {
                    count1++;
                }System.out.println(count1);
                if(count1<4){p=1;}
                int count=0;

                for(int i = 0; i<pass.length(); i++) {
                    count++;
                }System.out.println(count1);
                if(count<4){p=1;}
                System.out.println("p="+p);
                if(p==1){
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
                else{
                    try {
                        clientconnetc.Clientconnetc();
                        clientconnetc.coos.writeObject(2);
                        clientconnetc.coos.writeObject(login);
                        clientconnetc.coos.writeObject(pass);
                        clientconnetc.Closesocket();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                    dispose();
                    JFrame admin = new Success(1);
                    admin.setVisible(true);

                }



            }
        }
    }

}
