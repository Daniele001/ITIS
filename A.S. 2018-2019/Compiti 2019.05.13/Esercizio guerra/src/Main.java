import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Uomo: Inserisci esperienza e forza");
        Bene uomo = new Uomini(k.nextInt(), k.nextInt());
        uomo.calcolaForza();
        System.out.println("Elfo: Inserisci esperienza e forza");
        Bene elfo = new Elfi(k.nextInt(), k.nextInt());
        elfo.calcolaForza();
        System.out.println("Nano: Inserisci esperienza e forza");
        Bene nano = new Nani(k.nextInt(), k.nextInt());
        nano.calcolaForza();
        System.out.println("Hobbit: Inserisci esperienza e forza");
        Bene hobbit = new Hobbit(k.nextInt(), k.nextInt());
        hobbit.calcolaForza();
        System.out.println("Eroe buno: Inserisci nome e energia vitale");
        Bene eroeB = new EroeBuono(k.next(), k.nextInt());
        eroeB.calcolaForza();

        System.out.println("orco: Inserisci esperienza e forza");
        Male orco = new Orchi(k.nextInt(), k.nextInt());
        orco.calcolaForza();
        System.out.println("Urukhai: Inserisci esperienza e forza");
        Male uru = new Urukhai(k.nextInt(), k.nextInt());
        uru.calcolaForza();
        System.out.println("Sudrone: Inserisci esperienza e forza");
        Male sud = new Sudroni(k.nextInt(), k.nextInt());
        sud.calcolaForza();
        System.out.println("Eroe cattivo: Inserisci nome e energia vitale");
        Male eroeM = new EroeCattivo(k.next(), k.nextInt());
        eroeM.calcolaForza();

        if(Male.getForzaCombattimento() > Bene.getForzaCombattimento()) {
            System.out.println("Forze del male -> " + Male.getForzaCombattimento());
            System.out.println("Forze del bene -> " + Bene.getForzaCombattimento());
            System.out.println("Le forze del male hanno vinto");
        }
        else if(Male.getForzaCombattimento() < Bene.getForzaCombattimento()){
            System.out.println("Forze del male -> " + Male.getForzaCombattimento());
            System.out.println("Forze del bene -> " + Bene.getForzaCombattimento());
            System.out.println("Le forze del bene hanno vinto");
        }
        else {
            System.out.println("La battaglia è finita in parità");
        }
    }
}
