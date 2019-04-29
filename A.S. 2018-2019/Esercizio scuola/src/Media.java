public class Media extends Scuola {

    Media(String codice, String nome, String indirizzo, String citta, int nStudenti, int nClassi,
               int nSedi, int nLaboratori) {
        super(codice, nome, indirizzo, citta, nStudenti, nClassi, nSedi, nLaboratori);
        this.contrs = 125;
        this.contrsa = 9000;
        this.contrl = 1100;
    }

    @Override
    public String descrizione() {
        return "Scuola media";
    }
}
