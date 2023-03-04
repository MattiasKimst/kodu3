public class SõnedeAnalüsaator {
    private String analüüsitavSõne;

    public SõnedeAnalüsaator(String analüüsitavSõne) {
        this.analüüsitavSõne = analüüsitavSõne;
    }

    public void väljastaSõne() {
        System.out.println("Analüüsitav sõne on: \'" + analüüsitavSõne+"\'");
    }

    public double leiaKeskminePikkus() {
        String[] tükid = analüüsitavSõne.split(" ");
        double pikkusteSumma = 0;
        for (int tükk = 0; tükk < tükid.length; tükk++) {
            pikkusteSumma += tükid[tükk].length();
        }
        return pikkusteSumma / tükid.length;
    }

    public String leiaPikimSõna() {
        String[] tükid = analüüsitavSõne.split(" ");
        String pikimSõna = "";
        for (int tükk = 0; tükk < tükid.length; tükk++) {
            if (tükid[tükk].length() > pikimSõna.length()) {
                pikimSõna = tükid[tükk];
            }
        }
        return pikimSõna;
    }
}
