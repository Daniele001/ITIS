public class Tecnico extends Superiore {

    Tecnico(String codice, String nome, String indirizzo, String citta, int nStudenti, int nClassi,
          int nSedi, int nLaboratori) {
        super(codice, nome, indirizzo, citta, nStudenti, nClassi, nSedi, nLaboratori);
        this.contrc = 3500;
        this.contrl = 6000;
    }

    @Override
    public double spesa() {
        return ((contrc * getnClassi()) + (contrl * getnLaboratori()));
    }

    @Override
    public String descrizione() {
        return "Istituto tecnico";
    }
}
