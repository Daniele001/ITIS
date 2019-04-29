public class Abbigliamento extends Merce {
    static private double scontoUomo;
    static private double scontoDonna;
    private char sesso;
    private String taglia;
    private String tipologia;

    Abbigliamento(String codice, Double prezzoUnitario, char sesso, String taglia, String tipologia) {
        super(codice, prezzoUnitario);

    }

    public static void setScontoUomo(double percentuale) {
        Abbigliamento.scontoUomo = percentuale;
    }

    public static double getScontoUomo() {
        return scontoUomo;
    }

    public static void setScontoDonna(double percentuale) {
        Abbigliamento.scontoDonna = percentuale;
    }

    public static double getScontoDonna() {
        return scontoDonna;
    }

    public void setSesso(char sesso) {
        this.sesso = sesso;
    }

    public char getSesso() {
        return sesso;
    }

    public void setTaglia(String taglia) {
        this.taglia = taglia;
    }

    public String getTaglia() {
        return taglia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public String getTipologia() {
        return tipologia;
    }

    @Override
    public double calcolaImporto() {
        if(sesso == 'f') {
            return  getPrezzoUnitario() - ((getPrezzoUnitario() * scontoDonna) / 100);
        }
        else {
            return  getPrezzoUnitario() - ((getPrezzoUnitario() * scontoUomo) / 100);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Tipologia: " + getTipologia() + "Sesso: " + getSesso() +
                "Taglia: " + getTaglia() + "Prezzo: " + calcolaImporto();
    }

    public Abbigliamento clone() {
        Abbigliamento prodotto = new Abbigliamento(super.getCodice(), super.getPrezzoUnitario(), this.sesso,
                this.taglia, this.tipologia );
        return prodotto;
    }
}
