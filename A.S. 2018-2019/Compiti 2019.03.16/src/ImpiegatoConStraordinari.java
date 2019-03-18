public class ImpiegatoConStraordinari extends Impiegato {
    private int oreStraordinarieMensili;
    private double retribuzioneOrariaStraordinari;

    ImpiegatoConStraordinari(String nominativo, String sesso, String dataDiNascita, double stipendio, String livello,
                             int oreStraordinarieMensili, double retribuzioneOrariaStraordinari) {
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

    public void setRetribuzioneOrariaStraordinari(double retribuzioneOrariaStraordinari) {
        this.retribuzioneOrariaStraordinari = retribuzioneOrariaStraordinari;
    }

    public double getRetribuzioneOrariaStraordinari() {
        return retribuzioneOrariaStraordinari;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStraordinarie mensili "+ getOreStraordinarieMensili() +
                "\nRetribuzione oraria straordinari "+ getRetribuzioneOrariaStraordinari();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public double Stipendio() {
        return super.getStipendio() + (getRetribuzioneOrariaStraordinari() * getRetribuzioneOrariaStraordinari());
    }
}
