public class Carrello {
    private final int MAX_OGGETTI = 100;
    private int oggetti;
    private Merce[] contenutoCarrello;

    Carrello() {
        contenutoCarrello = new Merce[MAX_OGGETTI];
        this.oggetti = 0;
    }

    public void inserisciProdotto(Merce prodotto) {
        if(oggetti < MAX_OGGETTI) {
            this.contenutoCarrello[oggetti] = prodotto.clone();
        }
    }

    public double calcolaPrezzoTotale() {
        double prezzoTot = 0;
        for(int i = 0; i < oggetti; i++) {
            prezzoTot += this.contenutoCarrello[i].getPrezzoUnitario();
        }
        return prezzoTot;
    }

    public double calcolaCalorieTotali() {
        double calorieTot = 0;
        for(int i = 0; i < oggetti; i++) {
            if(this.contenutoCarrello[oggetti] instanceof Alimentari) {
                calorieTot += ((Alimentari) contenutoCarrello[i]).calcolaCalorie();
            }
        }
        return calorieTot;
    }

    public Merce[] esportaContennuto() {
        Merce[] prodotti = new Merce[oggetti];

        for(int i = 0; i < oggetti; i++) {
            prodotti[i] = contenutoCarrello[i].clone();
        }
        return prodotti;
    }
}
