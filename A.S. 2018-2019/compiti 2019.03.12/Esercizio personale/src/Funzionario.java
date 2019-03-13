public class Funzionario extends MembroPersonale {
    private int esperienza;
    private String grado;

    Funzionario(int codice, String cognome, String nome, int annoAssunzione, int esperienza, int ore) {
        super(codice, cognome, nome, annoAssunzione, ore);
        setEsperienza(esperienza);
    }

    public void setEsperienza(int esperienza) {
        this.esperienza = esperienza;
    }

    public int getEsperienza() {
        return esperienza;
    }

    public void setGrado() {
        if(esperienza < 10)
            this.grado = "junior";
        else
            this.grado = "senior";
    }

    public void stipendio() {
        int guad = 0;
        if(grado.equals("junior")){
            for(int i = 0; i < getOre(); i++) {
                guad += 70 * getOre();
            }
        }
        else {
            for(int i = 0; i < getOre(); i++) {
                guad += 80 * getOre();
            }
        }
        setGuadagno(guad);
    }
}
