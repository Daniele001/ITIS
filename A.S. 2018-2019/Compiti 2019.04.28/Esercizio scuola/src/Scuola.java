public abstract class Scuola {
    private String codice;
    private String nome;
    private String indirizzo;
    private String citta;
    private int nStudenti;
    private int nClassi;
    private int nSedi;
    private int nLaboratori;
    double contrs = 0;
    double contrsa = 0;
    double contrl = 0;

    Scuola(String codice, String nome, String indirizzo, String citta, int nStudenti, int nClassi, int nSedi, int nLaboratori) {
        setCodice(codice);
        setNome(nome);
        setindirizzo(indirizzo);
        setCitta(citta);
        setnStudenti(nStudenti);
        setnClassi(nClassi);
        setnSedi(nSedi);
        setnLaboratori(nLaboratori);
    }

    private void setCodice(String codice) {
        this.codice = codice;
    }

    public String getCodice() {
        return codice;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    private void setindirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getindirizzo() {
        return indirizzo;
    }

    private void setCitta(String citta) {
        this.citta = citta;
    }

    public String getCitta() {
        return citta;
    }

    private void setnStudenti(int nStudenti) {
        this.nStudenti = nStudenti;
    }

    private int getnStudenti() {
        return nStudenti;
    }

    private void setnClassi(int nClassi) {
        this.nClassi = nClassi;
    }

    private int getnClassi() {
        return nClassi;
    }

    private void setnSedi(int nSedi) {
        this.nSedi = nSedi;
    }

    private int getnSedi() {
        return nSedi;
    }

    private void setnLaboratori(int nLaboratori) {
        this.nLaboratori = nLaboratori;
    }

    private int getnLaboratori() {
        return nLaboratori;
    }

    public double spesa() {
        return ((contrs * getnStudenti()) + (contrsa * getnSedi()) + (contrl * getnLaboratori()));
    }

    public abstract String descrizione();
}
