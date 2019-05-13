public class Uomini extends Bene {


    Uomini(int esperienza, int forza) {
        try {
            setEsperienza(esperienza);
        } catch (IllegalArgumentException e) {
            System.out.println("ERRORE!! Inserisci un valore compreso tra 1 e 10");
            setEsperienza(k.nextInt());
        }

        setForza(forza);
    }

    public void setEsperienza(int esperienza) {
        if(esperienza >= 1 && esperienza <= 10)
            this.esperienza = esperienza;
        else
            throw new IllegalArgumentException();
    }

    public int getEsperienza() {
        return esperienza;
    }

    public void setForza(int forza) {
        this.forza = forza;
    }

    public int getForza() {
        return forza;
    }

    @Override
    int calcolaForza() {
        this.forza = 30 + (this.esperienza * 6);
        super.forzaCombattimento += this.forza;
        return this.forza;
    }
}
