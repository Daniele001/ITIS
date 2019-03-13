import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("inserisci:\n -> codice del treno (numerico)\n -> peso del vagone vuoto\n -> anno di costruzione\n ->" +
                " azienda costruttrice\n -> classe(a parole)\n -> posti disponibile\n -> posti occupate");
        VagonePasseggeri v = new VagonePasseggeri(k.nextInt(), k.nextDouble(), k.nextInt(), k.next(),
                k.next(), k.nextInt(), k.nextInt());
        System.out.println("inserisci:\n -> codice del treno(numerico)\n -> peso del vagone vuoto\n -> anno di costruzione\n -> " +
                "azienda costruttrice\n -> volume carico\n -> peso massimo del carico\n -> peso effettivo del carico");
        VagoneMerci m = new VagoneMerci(k.nextInt(), k.nextDouble(), k.nextInt(), k.next(), k.nextDouble(), k.nextDouble(),
                k.nextDouble());
        Treno treno = new Treno();
        treno.aggiungiVagoneMerci(m);
        treno.aggiungiVagonePasseggeri(v);
        System.out.println("peso totale del treno: " + treno.calcolaPeso());
    }
}
