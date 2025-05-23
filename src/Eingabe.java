import java.util.Scanner;
import java.util.InputMismatchException;

public class Eingabe
{
    public static int leseZahl()
    {
        int anzahl = 0;
        Ausgabe.zahlEingeben();
        Scanner scanner = new Scanner(System.in);
        try
        {
            anzahl = scanner.nextInt();
        }
        catch (InputMismatchException e)
        {
            Ausgabe.keineZahl();
            leseZahl();
        }
        return anzahl;
    }

    public static int leseHoelzer()
    {
        int anzahl = 0;
        anzahl = leseZahl();
            if (anzahl < 1 || anzahl > 3)
            {
                Ausgabe.zahlNichtimBereich();
                leseHoelzer();
            }
            return anzahl;
    }
}