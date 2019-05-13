import java.util.Scanner;

abstract class Male {
    static int forzaCombattimento;
    protected int esperienza;
    protected int forza;
    Scanner k = new Scanner(System.in);

    public Male() {
        setForzaCombattimento();
    }

    private void setForzaCombattimento() {
        forzaCombattimento = 0;
    }

    static public int getForzaCombattimento() {
        return forzaCombattimento;
    }

    abstract int calcolaForza();
}
