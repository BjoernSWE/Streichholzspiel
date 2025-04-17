import java.util.Scanner;
import java.util.InputMismatchException;

public class Eingabe
{
    public static int leseZahl()
    {
        Ausgabe.zahlEingeben();
        Scanner scanner = new Scanner(System.in);
        int anzahl = 0;
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
        leseZahl();
            anzahl = leseZahl();
            if (anzahl < 1 || anzahl > 3)
            {
                Ausgabe.zahlNichtimBereich();
                leseHoelzer();
            }
            return anzahl;
    }
}