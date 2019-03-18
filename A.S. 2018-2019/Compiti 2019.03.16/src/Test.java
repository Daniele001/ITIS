import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Inserisci il nome (non usare spazi, usare \"_\"), il sesso, la data di nascita (in questo" +
                " modo: 12/03/2019, per i numeri ad una cifra si mette lo zero), lo stipendio e le ore di docenza.");
        Docente docente = new Docente(k.next(), k.next(), k.next(), k.nextDouble(), k.nextInt());
        System.out.println("Inserisci il nome (non usare spazi, usare \"_\"), il sesso, la data di nascita (in " +
                "questo modo: 12/03/2019, per i numeri ad una cifra si mette lo zero), lo stipendio e livello (lavoro vhe svolge).");
        Impiegato bidello = new Impiegato(k.next(), k.next(), k.next(), k.nextDouble(), k.next());
        System.out.println("Inserisci il nome (non usare spazi, usare \"_\"), il sesso, la data di nascita (in questo modo: 12/03/2019, " +
                "per i numeri ad una cifra si mette lo zero), lo stipendio, il livello, le ore straordinarie fatte nel mese e il " +
                "costo orario delle strordinarie.");
        ImpiegatoConStraordinari bidello2 = new ImpiegatoConStraordinari(k.next(), k.next(), k.next(),
                k.nextDouble(), k.next(), k.nextInt(), k.nextDouble());

        System.out.println(docente.toString());
        System.out.println(bidello.toString());
        System.out.println(bidello2.toString());
        System.out.println(bidello.equals(bidello2));
        System.out.println("Stipendio totale: " + bidello2.Stipendio());
    }
}
