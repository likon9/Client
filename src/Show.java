import java.io.IOException;

public class Show {
    Clientconnetc clientconnetc = new Clientconnetc();

     int t;
    int idm[] = new int[99];
    String markm[] = new String[999];
    int agem[] = new int[999];
    int pricem[] = new int[999];
    int statm[] = new  int[999];
    String loginm[] = new  String[999];
    String passm[] = new  String[999];
    int id;
    String mark = null;
    int age;
    int price;
    int stat;
    int i;
    String login;
    String pass;
   public void Show() throws  ClassNotFoundException {

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
                mark = (String) clientconnetc.cois.readObject();
                age = (int) clientconnetc.cois.readObject();
                price = (int) clientconnetc.cois.readObject();
                stat = (int) clientconnetc.cois.readObject();
                login = (String) clientconnetc.cois.readObject();
                idm[t]=id;
                markm[t]=mark;
                agem[t]=age;
                pricem[t]=price;
                statm[t]=stat;
                loginm[t]=login;

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
