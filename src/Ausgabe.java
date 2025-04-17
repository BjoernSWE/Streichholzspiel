public class Ausgabe
{
    public static void zahlEingeben()
    {
        System.out.println("Bitte geben Sie eine Zahl ein:");
    }

    public static void keineZahl()
    {
        System.out.println("Das ist keine Zahl! Bitte geben Sie eine Zahl ein:");
    }

    public static void zahlNichtimBereich()
    {
        System.out.println("Die Zahl ist nicht im Bereich von 1 bis 3! Bitte geben Sie eine Zahl ein:");
    }

    public static void SpielerGewinnt()
    {
        System.out.println("Herzlichen Glückwunsch! Sie haben gewonnen!");
    }

    public static void ComputerGewinnt()
    {
        System.out.println("Der Computer hat gewonnen! Sie haben verloren!");
    }

    public static void zugNichtMöglich()
    {
        System.out.println("Es sind nicht genügend Streichhölzer vorhanden, um diese Anzahl zu ziehen!");
    }

    public static void Spielstand(int Streichholzanzahl)
    {
        System.out.println("Es sind noch " + Streichholzanzahl + " Streichhölzer übrig.");
    }

    public static void SpielerZug(int Streichholzanzahl, int SpielerZug)
    {
        System.out.println("Sie ziehen " + SpielerZug + " Streichhölzer.");
        Spielstand(Streichholzanzahl);
    }

    public static void ComputerZug(int Streichholzanzahl, int ComputerZug)
    {
        System.out.println("Der Computer zieht " + ComputerZug + " Streichhölzer.");
        Spielstand(Streichholzanzahl);
    }       

}