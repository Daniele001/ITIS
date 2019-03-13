public class Progetto {
    private int posizione;
    private final int MAX_M = 256;
    private MembroPersonale[] membro;

    Progetto() {
        membro = new MembroPersonale[MAX_M];
    }

    public void setMembro(MembroPersonale m) {
        this.membro[posizione] = m;
        posizione++;
    }

    public int costoTot() {
        int costoTot = 0;
        for(int i = 0; i < posizione; i++) {
            costoTot += membro[i].getGuadagno();
        }
        return costoTot;
    }
}
