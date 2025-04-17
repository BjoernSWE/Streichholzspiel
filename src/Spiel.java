public class Spiel
{
    private int Streichholzanzahl;

    public Spiel(int Streichholzanzahl)
    {
        this.Streichholzanzahl = Streichholzanzahl;
        return Streichholzanzahl;

        while(Streichholzanzahl > 0)
        {
            ComZiehen();
            if(Streichholzanzahl <= 0)
            {
                System.out.println("Der Computer hat verloren!");
                break;
            }
            System.out.println("Es sind noch " + Streichholzanzahl + " Streichhölzer übrig.");
            System.out.println("Wie viele Streichhölzer möchten Sie ziehen? (1-3)");
            Scanner scanner = new Scanner(System.in);
            int anzahl = scanner.nextInt();
            if(anzahl < 1 || anzahl > 3)
            {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine Zahl zwischen 1 und 3 ein.");
                continue;
            }
            Streichholzanzahl -= anzahl;
            if(Streichholzanzahl <= 0)
            {
                System.out.println("Sie haben leider verloren!");
                break;
            }
        }
    }

    public void ComZiehen(int Anzahl)
    {

    }

    public void SpielerZiehen(int Anzahl)
    {
        
    }

    private void berechneComZug()
    {

    }
}