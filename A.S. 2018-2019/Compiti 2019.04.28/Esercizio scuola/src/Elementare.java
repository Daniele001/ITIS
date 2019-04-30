public class Elementare extends Scuola {

    Elementare(String codice, String nome, String indirzzo, String citta, int nStudenti, int nClassi,
               int nSedi, int nLaboratori) {
        super(codice, nome, indirzzo, citta, nStudenti, nClassi, nSedi, nLaboratori);
        this.contrs = 125;
        this.contrsa = 9000;
    }

    @Override
    public String descrizione() {
        return  "Scuola elementare";
    }
}
