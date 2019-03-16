import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
        String data = k.next();
        Date fd = null;
        try {
            fd = d.parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Docente bettinelli = new Docente(k.next(), k.next(), d.format(fd), k.nextDouble(), k.nextInt());
        System.out.println(bettinelli.getDataDiNascita());
    }
}
