abstract public class Merce {
    private String codice;
    private double prezzoUnitario;

    Merce(String codice, Double prezzoUnitario) {
        this.codice = codice;
        this.prezzoUnitario = prezzoUnitario;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getCodice() {
        return codice;
    }

    public void setPrezzoUnitario(double prezzoUnitario) {
        this.prezzoUnitario = prezzoUnitario;
    }

    public double getPrezzoUnitario() {
        return prezzoUnitario;
    }

    abstract public double calcolaImporto();

    abstract public Merce clone();

    public String toString() {
       return "codice :" + getCodice() + "prezzo unitario: " + getPrezzoUnitario();
    }
}
