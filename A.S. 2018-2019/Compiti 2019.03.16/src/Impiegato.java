import java.util.Date;

public class Impiegato extends Dipendente {
    private String livello;

    Impiegato(String nominativo, String sesso, String dataDiNascita, double stipendio, String livello) {
        super(nominativo, sesso, dataDiNascita, stipendio);
        setLivello(livello);
    }

    public void setLivello(String livello) {
        this.livello = livello;
    }

    public String getLivello() {
        return livello;
    }

    @Override
    public String toString() {
        return super.toString() + getLivello();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
