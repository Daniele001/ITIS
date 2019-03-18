import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dipendente {
    private String nominativo;
    private String sesso;
    private LocalDate dataDiNascita;
    private double stipendio;
    private DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

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
        this.dataDiNascita = LocalDate.parse(dataDiNascita, format);
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    public double getStipendio() {
        return stipendio;
    }

    public String toString() {
        return "Nome: " + getNominativo() + "\nSesso: " + getSesso() + "\nData di nascita: "
                + getDataDiNascita().format(format) + "\nStipendio: " + getStipendio();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
