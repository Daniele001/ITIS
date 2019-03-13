public class Dirigente extends MembroPersonale {
    Dirigente(int codice, String cognome, String nome, int annoAssunzione, int ore) {
        super(codice, cognome, nome, annoAssunzione, ore);
    }

    public void stipendio() {
        setGuadagno(100);
    }
}
