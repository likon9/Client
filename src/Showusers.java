import java.io.IOException;

public class Showusers extends Show {
    Clientconnetc clientconnetc = new Clientconnetc();


    int i;
    public void Showusers() throws  ClassNotFoundException {

        try {
            clientconnetc.Clientconnetc();
            i = (int) clientconnetc.cois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(t=0; t<i; t++)
        {
            try {
                id = (int) clientconnetc.cois.readObject();
                login = (String) clientconnetc.cois.readObject();
                pass = (String) clientconnetc.cois.readObject();
                idm[t]=id;
                loginm[t]=login;
                passm[t]=pass;
              //  System.out.println("id="+idp[t]+"login="+loginp[t]+"pass"+passp[t]);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        try {
            clientconnetc.Closesocket();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
