public class Vagone {
    private int codice;
    private double pesoAVuoto;
    private String aziendaCostruttrice;
    private int annoDiCostruzione;
    private double peso;

    Vagone(int codice, double pesoAVuoto, int annoDiCostruzione, String aziendaCostruttrice) {
        setCodice(codice);
        setPesoAVuoto(pesoAVuoto);
        setAnnoDiCostruzione(annoDiCostruzione);
        setAziendaCostruttrice(aziendaCostruttrice);
    }

    private void setCodice(int codice) {
        this.codice = codice;
    }

    public int getCodice() {
        return codice;
    }

    private void setPesoAVuoto(double pesoAVuoto) {
        this.pesoAVuoto = pesoAVuoto;
    }

    public double getPesoAVuoto() {
        return pesoAVuoto;
    }

    private void setAnnoDiCostruzione(int annoDiCostruzione) {
        this.annoDiCostruzione = annoDiCostruzione;
    }

    public int getAnnoDiCostruzione() {
        return annoDiCostruzione;
    }

    private void setAziendaCostruttrice(String aziendaCostruttrice) {
        this.aziendaCostruttrice = aziendaCostruttrice;
    }

    public String getAziendaCostruttrice() {
        return aziendaCostruttrice;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }
}
