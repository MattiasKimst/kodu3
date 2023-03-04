public class Kodanik {
    private String eesnimi;
    private String perekonnanimi;
    private String isikukood;
    private boolean juhiluba;

    public Kodanik(String eesnimi, String perekonnanimi, String isikukood, boolean juhiluba) {
        this.eesnimi = eesnimi;
        this.perekonnanimi = perekonnanimi;
        this.isikukood = isikukood;
        this.juhiluba = juhiluba;
    }

    public String getIsikukood() {
        return isikukood;
    }
    public boolean kasJuhilubaOnOlemas(){
        if (juhiluba==true){
            return true;
        }
        return false;

    }
    public boolean kasOnTäiskasvanuAastal2018(){
         int sünniAasta=Integer.parseInt(isikukood.substring(1,3));
         if ((1 <= sünniAasta) && (sünniAasta < 19)){// sest parseint teisendab nt 02->2
             return false;
         }
         return true;

    }

    @Override
    public String toString() {
        return  eesnimi + " " + perekonnanimi ;
    }
}
