public class MembroPersonale {
    private int codice;
    private String cognome;
    private String nome;
    private int annoAssunzione;
    private int ore;
    private int guadagno = 0;

    MembroPersonale(int codice, String cognome, String nome, int annoAssunzione, int ore) {
        setCodice(codice);
        setNome(nome);
        setCognome(cognome);
        setAnnoAssunzione(annoAssunzione);
        setOre(ore);
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public int getCodice() {
        return codice;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setAnnoAssunzione(int annoAssunzione) {
        this.annoAssunzione = annoAssunzione;
    }

    public int getAnnoAssunzione() {
        return annoAssunzione;
    }

    public void setOre(int ore) {
        this.ore = ore;
    }

    public int getOre() {
        return ore;
    }

    public void setGuadagno(int guadagno) {
        this.guadagno = guadagno;
    }

    public int getGuadagno() {
        return guadagno;
    }
}
