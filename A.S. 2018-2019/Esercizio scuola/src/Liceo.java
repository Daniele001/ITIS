public class Liceo extends Superiore {

    Liceo(String codice, String nome, String indirizzo, String citta, int nStudenti, int nClassi,
          int nSedi, int nLaboratori) {
        super(codice, nome, indirizzo, citta, nStudenti, nClassi, nSedi, nLaboratori);
        this.contrs = 125;
        this.contrl = 1100;
    }

    @Override
    public double spesa() {
        return ((contrs * getnStudenti()) + (contrl * getnLaboratori()));
    }

    @Override
    public String descrizione() {
        return "Liceo";
    }
}
