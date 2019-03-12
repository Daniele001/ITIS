public class Treno {
    private final int VAGONI_MAX = 64;
    private int posizione;
    private Vagone[] treno;

    Treno() {
        treno = new Vagone[VAGONI_MAX];
        this.posizione = 0;
    }

    public void aggiungiVagonePasseggeri(VagonePasseggeri v) {
        this.treno[posizione] = v;
        posizione++;
    }

    public void aggiungiVagoneMerci(VagoneMerci m) {
        this.treno[posizione] = m;
        posizione++;
    }

    public double calcolaPeso(Treno t) {
        double pesoTotale = 0;
        for(int pos = 0; pos < posizione; pos++) {
            pesoTotale += treno[pos].getPeso();
        }
        return pesoTotale;
    }
}
