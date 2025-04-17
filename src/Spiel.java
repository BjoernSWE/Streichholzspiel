import java.util.Scanner;

public class Spiel
{
    private int Streichholzanzahl;

    public Spiel(int Streichholzanzahl)
    {
        this.Streichholzanzahl = Streichholzanzahl;
        Ausgabe.Spielstand(Streichholzanzahl);
        while(Streichholzanzahl > 0)
        {
            ComZiehen();
            if(Streichholzanzahl <= 0)
            {
                Ausgabe.SpielerGewinnt();
                break;
            }
            Ausgabe.Spielstand(Streichholzanzahl);
            Ausgabe.zahlEingeben();
            SpielerZiehen();
            if(Streichholzanzahl <= 0)
            {
                Ausgabe.ComputerGewinnt();
                break;
            }
        }
    }

    public int ComZiehen()
    {
        berechneComZug();
        int Anzahl = berechneComZug();
        this.Streichholzanzahl -= Anzahl;
        Ausgabe.ComputerZug(Streichholzanzahl, Anzahl);
        return Streichholzanzahl;
    }

    public int SpielerZiehen()
    {
        int Anzahl = Eingabe.leseHoelzer();
        if(Streichholzanzahl - Anzahl < 0)
        {
            Ausgabe.zugNichtMöglich();
            SpielerZiehen();
        }else
        {
            this.Streichholzanzahl -= Anzahl;
            Ausgabe.SpielerZug(Streichholzanzahl, Anzahl);
        }
        return Streichholzanzahl;
    }

    private int berechneComZug()
    {
        int Anzahl = 1;
        return Anzahl;
    }
}