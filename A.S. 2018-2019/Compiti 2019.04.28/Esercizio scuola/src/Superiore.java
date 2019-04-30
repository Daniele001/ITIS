public abstract class Superiore extends Scuola {
    double contrc = 0;

    Superiore(String codice, String nome, String indirizzo, String citta, int nStudenti, int nClassi,
          int nSedi, int nLaboratori) {
        super(codice, nome, indirizzo, citta, nStudenti, nClassi, nSedi, nLaboratori);
    }

    @Override
    public abstract double spesa();

    @Override
    public abstract String descrizione();
}
