import java.util.Scanner;

abstract class Bene {
    static protected int forzaCombattimento;
    protected int esperienza;
    protected int forza;
    Scanner k = new Scanner(System.in);

    Bene() {
        setForzaCombattimento();
    }

    public void setForzaCombattimento() {
        forzaCombattimento = 0;
    }

    static public int getForzaCombattimento() {
        return forzaCombattimento;
    }

    abstract int calcolaForza();
}
