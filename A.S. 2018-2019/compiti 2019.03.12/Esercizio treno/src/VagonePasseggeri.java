public class VagonePasseggeri extends Vagone {
    private String classe;
    private int postiDisponibili;
    private int postiOccupati;

    VagonePasseggeri(int codice, double pesoAVuoto, int annoDiCostruzione, String aziendaCostruttrice,
                            String classe, int postiDisponibili, int postiOccupati) {
        super(codice, pesoAVuoto, annoDiCostruzione, aziendaCostruttrice);
        setClasse(classe);
        setPostiDisponibili(postiDisponibili);
        setPostiOccupati(postiOccupati);
        super.setPeso(peso());
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getClasse() {
        return classe;
    }

    public void setPostiDisponibili(int postiDisponibili) {
        this.postiDisponibili = postiDisponibili;
    }

    public int getPostiDisponibili() {
        return postiDisponibili;
    }

    public void setPostiOccupati(int postiOccupati) {
        this.postiOccupati = postiOccupati;
    }

    public double peso() {
        return (getPesoAVuoto() + (postiOccupati * 65));
    }

    public int getPostiOccupati() {
        return postiOccupati;
    }
}
