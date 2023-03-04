public class SõnedeAnalüüsimine{
    public static void main(String[] args) {
        SõnedeAnalüsaator mingiAnalüsaator = new SõnedeAnalüsaator("Lause kus pikim sõna on viimane");
        mingiAnalüsaator.väljastaSõne();
        System.out.println(mingiAnalüsaator.leiaKeskminePikkus());
        System.out.println(mingiAnalüsaator.leiaPikimSõna());
    }
}
