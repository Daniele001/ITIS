import java.util.Date;

public class Docente extends Dipendente {
    private int oreDocenza;

    Docente(String nominativo, String sesso, String dataDiNascita, double stipendio, int oreDocenza) {
        super(nominativo, sesso, dataDiNascita, stipendio);
        setOreDocenza(oreDocenza);
    }

    public void setOreDocenza(int oreDocenza) {
        this.oreDocenza = oreDocenza;
    }

    public int getOreDocenza() {
        return oreDocenza;
    }

    @Override
    public String toString() {
        return super.toString() + getOreDocenza();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
