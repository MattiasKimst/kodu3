import java.io.File;
import java.io.FileNotFoundException;

public class Võistlused {
    static String lühenda(String rida) {
        String[] tükid = rida.split(" ");
        char[] lühend = new char[tükid.length+2];
        for (int i = 0; i < tükid.length; i++) {
            try {
                Integer.parseInt(tükid[i]);//proovib, kas sõne on arv
                lühend[i] = '\'';
                lühend[i + 1] = tükid[i].charAt(2);
                lühend[i + 2] = tükid[i].charAt(3);


            } catch (Exception e) {
                lühend[i] = Character.toUpperCase(tükid[i].charAt(0));
            }
        }
        return new String(lühend);
    }

    public static void main(String[] args) throws FileNotFoundException {

        try (java.util.Scanner sc = new java.util.Scanner(new File("võistlused.txt"), "UTF-8")) {
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                System.out.println(lühenda(rida));
            }
        }
    }
}
