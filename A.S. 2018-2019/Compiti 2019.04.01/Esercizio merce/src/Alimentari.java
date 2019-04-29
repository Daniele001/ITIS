abstract public class Alimentari extends Merce{
    private String descrizione;
    private double peso;
    private double calorieUnitarie;

    Alimentari(String codice, Double prezzoUnitario, String descrizione, double peso, double calorieUnitarie) {
        super(codice, prezzoUnitario);
        setDescrizione(descrizione);
        setPeso(peso);
        setCalorieUnitarie(calorieUnitarie);
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setCalorieUnitarie(double calorieUnitarie) {
        this.calorieUnitarie = calorieUnitarie;
    }

    public double getCalorieUnitarie() {
        return calorieUnitarie;
    }

    @Override
    public double calcolaImporto() {
        return super.getPrezzoUnitario() * peso;
    }

    public double calcolaCalorie() {
        return peso * calorieUnitarie;
    }

    @Override
    public String toString() {
        return super.toString() + "Descrizione: " + descrizione + "Peso: " + peso + "Importo: " +
                calcolaImporto() + "Calorie: " + calcolaCalorie();
    }
}
