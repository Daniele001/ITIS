public class Tecnico extends MembroPersonale {
    private String competenza;
    private boolean interno = false;


    Tecnico(int codice, String cognome, String nome, int annoAssunzione, int ore, String competenza, boolean interno) {
        super(codice, cognome, nome, annoAssunzione, ore);
        setCompetenza(competenza);
        setInterno(interno);
    }

    public void setCompetenza(String competenza) {
        this.competenza = competenza;
    }

    public String getCompetenza() {
        return competenza;
    }

    public void setInterno(boolean interno) {
        this.interno = interno;
    }

    public void stipendio() {
        int guad = 0;
        switch (competenza) {
            case "informatica":
            case "telecomunicazioni":
                    guad = 40 * getOre();
                    if(interno) {
                        guad += 1 * getOre();
                    }
                    break;
            case "elettronica":
            case "automazione":
                    guad += 50 * getOre();
                    if(interno) {
                        guad += 1 * getOre();
                    }
                    break;
        }
        setGuadagno(guad);
    }
}
