import java.util.Date;

public class ImpiegatoConStraordinari extends Impiegato {
    private int oreStraordinarieMensili;
    private int retribuzioneOrariaStraordinari;

    ImpiegatoConStraordinari(String nominativo, String sesso, String dataDiNascita, double stipendio, String livello,
                             int oreStraordinarieMensili, int retribuzioneOrariaStraordinari) {
        super(nominativo, sesso, dataDiNascita,stipendio, livello);
        setOreStraordinarieMensili(oreStraordinarieMensili);
        setRetribuzioneOrariaStraordinari(retribuzioneOrariaStraordinari);
    }

    public void setOreStraordinarieMensili(int oreStraordinarieMensili) {
        this.oreStraordinarieMensili = oreStraordinarieMensili;
    }

    public int getOreStraordinarieMensili() {
        return oreStraordinarieMensili;
    }

    public void setRetribuzioneOrariaStraordinari(int retribuzioneOrariaStraordinari) {
        this.retribuzioneOrariaStraordinari = retribuzioneOrariaStraordinari;
    }

    public int getRetribuzioneOrariaStraordinari() {
        return retribuzioneOrariaStraordinari;
    }

    @Override
    public String toString() {
        return super.toString() + getOreStraordinarieMensili() + getRetribuzioneOrariaStraordinari();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
