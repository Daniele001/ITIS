public class Tecnico extends MembroPersonale {
    private String competenza;

    Tecnico(int codice, String cognome, String nome, int annoAssunzione, int ore, String competenza) {
        super(codice, cognome, nome, annoAssunzione, ore);
        setCompetenza(competenza);
    }

    public void setCompetenza(String competenza) {
        this.competenza = competenza;
    }

    public String getCompetenza() {
        return competenza;
    }

    public void stipendio() {
        int guad = 0;
        switch (competenza) {
            case "informatica":
            case "telecomunicazioni":
                for(int i = 0; i < getOre(); i++) {
                    guad += 40 * getOre();
                }
            case "elettronica":
            case "automazione":
                for(int i = 0; i < getOre(); i++) {
                    guad += 50 * getOre();
                }
        }
        setGuadagno(guad);
    }
}
