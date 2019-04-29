public class Freschi extends Alimentari {
    static private double costoSacchetto;
    private boolean confezionato;

    Freschi(String codice, Double prezzoUnitario, String descrizione, double peso, double calorieUnitarie, boolean confezionato) {
        super(codice, prezzoUnitario, descrizione, peso, calorieUnitarie);

    }

    public static void setCostoSacchetto(double costoSacchetto) {
        Freschi.costoSacchetto = costoSacchetto;
    }

    public static double getCostoSacchetto() {
        return costoSacchetto;
    }

    public void setConfezionato(boolean confezionato) {
        this.confezionato = confezionato;
    }

    public boolean getConfezionato() {
        return confezionato;
    }

    @Override
    public String toString() {
        String tipoConfezione;

        if(!confezionato) {
            tipoConfezione = "Sfusa";
        }
        else {
            tipoConfezione = "Preconfezionata";
        }

        return super.toString() + "Confezione: " + tipoConfezione;
    }

    public Freschi clone() {
        Freschi prodotto = new Freschi(super.getCodice(), super.getPrezzoUnitario(),
                super.getDescrizione(), super.getPeso(), super.getCalorieUnitarie(), this.confezionato);
        return prodotto;
    }
}
