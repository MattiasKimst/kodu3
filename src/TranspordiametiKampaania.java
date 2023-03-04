import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TranspordiametiKampaania {
    public static ArrayList<Kodanik> loeKodanikud(String failiNimi) throws FileNotFoundException {
        ArrayList<Kodanik> kodanikud;
        try (java.util.Scanner sc = new java.util.Scanner(new File(failiNimi), "UTF-8")) {
            kodanikud = new ArrayList<>();
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                String[] tükid = rida.split(",");
                String perenimi = tükid[0];
                String eesnimi = tükid[1];
                String isikukood = tükid[2];
                boolean juhiluba = false;
                if (tükid[3].equals("Olemas")) {
                    juhiluba = true;
                }
                kodanikud.add(new Kodanik(eesnimi, perenimi, isikukood, juhiluba));

            }

        }
        return kodanikud;

    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Kodanik> kodanikeList = loeKodanikud("kodanikud.txt");
        ArrayList<Kodanik> saiJuhiloaKingituseks = new ArrayList<>();
        for (Kodanik kodanik : kodanikeList) {
            if (kodanik.kasJuhilubaOnOlemas() == true) {
                System.out.println(kodanik.toString() + " juhiluba kingituseks ei saanud, põhjus: juhiluba juba olemas");
            } else {
                if (kodanik.kasOnTäiskasvanuAastal2018() == false) {
                    System.out.println(kodanik.toString() + " juhiluba kingituseks ei saanud, põhjus: pole täiskasvanu");
                } else {
                    System.out.println(kodanik.toString() + " sai juhiloa kingituseks.");
                    saiJuhiloaKingituseks.add(kodanik);
                }

            }

        }
        kodanikeList.removeAll(saiJuhiloaKingituseks);
        System.out.println("\nKodanikud kes jäid kingitusest ilma:");
        for (Kodanik kodanik : kodanikeList) {
            System.out.println(kodanik.getIsikukood());
        }

    }
}
