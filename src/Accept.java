import java.io.IOException;

public class Accept {
    Clientconnetc clientconnetc = new Clientconnetc();

    private int t;
    int idm[] = new int[99];
    String markm[] = new String[999];
    String monthm[] = new String[999];

    int id;
    String mark = null;
    String month = null;

    int i;

    public void Accept() throws  ClassNotFoundException {

        try {
            clientconnetc.Clientconnetc();
            i = (int) clientconnetc.cois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(i);

        for(t=0; t<i; t++)
        {
            try {
                id = (int) clientconnetc.cois.readObject();
                mark = (String) clientconnetc.cois.readObject();
                month = (String) clientconnetc.cois.readObject();

                System.out.println(mark);
                idm[t]=id;
                markm[t]=mark;
                monthm[t]=month;


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