public class Conservati extends Alimentari{
    private String marca;

    Conservati(String codice, Double prezzoUnitario, String descrizione, double peso, double calorieUnitarie, String marca) {
        super(codice, prezzoUnitario, descrizione, peso, calorieUnitarie);
        setMarca(marca);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return super.toString() + "Marca: " + marca;
    }

    public Conservati clone() {
        Conservati prodotto = new Conservati(super.getCodice(), super.getPrezzoUnitario(),
                super.getDescrizione(), super.getPeso(), super.getCalorieUnitarie(), this.marca);
        return prodotto;
    }
}
