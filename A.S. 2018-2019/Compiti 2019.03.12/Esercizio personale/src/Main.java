import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("inserisci:\n -> codice (numerico)\n -> nome\n -> cognome\n ->" +
                " anno assunzione\n -> ore");
        Dirigente d = new Dirigente(k.nextInt(), k.next(), k.next(), k.nextInt(), k.nextInt());
        d.stipendio();
        System.out.println("inserisci:\n -> codice (numerico)\n -> nome\n -> cognome\n ->" +
                " anno assunzione\n -> anni di esperienza\n -> ore");
        Funzionario f = new Funzionario(k.nextInt(), k.next(), k.next(), k.nextInt(),k.nextInt(), k.nextInt());
        f.setGrado();
        f.stipendio();
        System.out.println("inserisci:\n -> codice (numerico)\n -> nome\n -> cognome\n ->" +
                " anno assunzione\n -> ore\n -> competenza(informatica, telecomunicazioni, elettronica o automazione)" +
                "\n -> dipendente interno o esterno? (inserisci \"true\" se interno o \"false\" se esterno)");
        Tecnico t = new Tecnico(k.nextInt(), k.next(), k.next(), k.nextInt(), k.nextInt(), k.next(), k.nextBoolean());
        t.stipendio();
        Progetto p = new Progetto();

        p.setMembro(d);
        p.setMembro(f);
        p.setMembro(t);
        System.out.println("costo totale dipendenti " + p.costoTot());
    }
}
