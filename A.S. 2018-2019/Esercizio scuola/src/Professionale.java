public class Professionale extends Superiore {

    Professionale(String codice, String nome, String indirizzo, String citta, int nStudenti, int nClassi,
            int nSedi, int nLaboratori) {
        super(codice, nome, indirizzo, citta, nStudenti, nClassi, nSedi, nLaboratori);
        this.contrc = 2400;
        this.contrl = 3000;
    }

    @Override
    public double spesa() {
        return ((contrc * getnClassi()) + (contrl * getnLaboratori()));
    }

    @Override
    public String descrizione() {
        return "Professionale";
    }
}
