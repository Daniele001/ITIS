import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Inserici codice alfanumerico, indirizzo, città, nome della scuola, numero di studenti, " +
                "numero delle classi, numemro delle sedi aggiuntive e dei laboratori della scuola elementare");
        Elementare elementare = new Elementare(k.next(), k.next(), k.next(), k.next(), k.nextInt(), k.nextInt(), k.nextInt(), k.nextInt());
        System.out.println("Inserici codice alfanumerico, indirizzo, città, nome della scuola, numero di studenti, " +
                "numero delle classi, numemro delle sedi aggiuntive e dei laboratori della scuola media");
        Media media = new Media(k.next(), k.next(), k.next(), k.next(), k.nextInt(), k.nextInt(), k.nextInt(), k.nextInt());
        System.out.println("Inserici codice alfanumerico, indirizzo, città, nome della scuola, numero di studenti, " +
                "numero delle classi, numemro delle sedi aggiuntive e dei laboratori del liceo");
        Superiore liceo = new Liceo(k.next(), k.next(), k.next(), k.next(), k.nextInt(), k.nextInt(), k.nextInt(), k.nextInt());
        System.out.println("Inserici codice alfanumerico, indirizzo, città, nome della scuola, numero di studenti, " +
                "numero delle classi, numemro delle sedi aggiuntive e dei laboratori dell'istituto tecnico");
        Superiore tecnico = new Tecnico(k.next(), k.next(), k.next(), k.next(), k.nextInt(), k.nextInt(), k.nextInt(), k.nextInt());
        System.out.println("Inserici codice alfanumerico, indirizzo, città, nome della scuola, numero di studenti, " +
                "numero delle classi, numemro delle sedi aggiuntive e dei laboratori del professionale");
        Superiore professionale = new Professionale(k.next(), k.next(), k.next(), k.next(), k.nextInt(), k.nextInt(), k.nextInt(), k.nextInt());

        System.out.println("Spesa " + elementare.descrizione() + ": " + elementare.spesa() + " €");
        System.out.println("Spesa " + media.descrizione() + ": " + media.spesa() + " €");
        System.out.println("Spesa " + liceo.descrizione() + ": " + liceo.spesa() + " €");
        System.out.println("Spesa " + tecnico.descrizione() + ": " + tecnico.spesa() + " €");
        System.out.println("Spesa " + professionale.descrizione() + ": " + professionale.spesa() + " €");

    }
}
