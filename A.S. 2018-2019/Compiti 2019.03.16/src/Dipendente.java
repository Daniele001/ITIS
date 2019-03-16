import java.util.Date;

public class Dipendente {
    private String nominativo;
    private String sesso;
    private String dataDiNascita;
    private double stipendio;

    Dipendente(String nominativo, String sesso, String dataDiNascita, double stipendio) {
        setNominativo(nominativo);
        setSesso(sesso);
        setDataDiNascita(dataDiNascita);
        setStipendio(stipendio);
    }

    public void setNominativo(String nominativo) {
        this.nominativo = nominativo;
    }

    public String getNominativo() {
        return nominativo;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public String getSesso() {
        return sesso;
    }

    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    public double getStipendio() {
        return stipendio;
    }

    public String toString() {
        return getNominativo() + getSesso() + getDataDiNascita() + getStipendio();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
