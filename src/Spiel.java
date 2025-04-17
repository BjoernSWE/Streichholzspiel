import java.util.*;

public class Spiel
{
    private int Streichholzanzahl;

    public Spiel(int Streichholzanzahl)
    {
        this.Streichholzanzahl = Streichholzanzahl;
        Ausgabe.Spielstand(this.Streichholzanzahl);
        while(this.Streichholzanzahl > 0)
        {
            SpielerZiehen();
            if(this.Streichholzanzahl <= 0)
            {
                Ausgabe.ComputerGewinnt();
                break;
            }
            ComZiehen();
            if(this.Streichholzanzahl <= 0)
            {
                Ausgabe.SpielerGewinnt();
                break;
            }
        }
    }

    public int ComZiehen()
    {
        int Anzahl = berechneComZug();
        Streichholzanzahl -= Anzahl;
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
            Streichholzanzahl -= Anzahl;
            Ausgabe.SpielerZug(Streichholzanzahl, Anzahl);
        }
        return Streichholzanzahl;
    }

    private int berechneComZug()
    {
        int Anzahl = 0;
        if(Streichholzanzahl > 4)
        {
            Anzahl = Streichholzanzahl % 4;
            if(Anzahl == 0)
            {
                Anzahl = (int)(Math.random() * 3) + 1;
            }
        }
        else
        {
            Anzahl = Streichholzanzahl - 1;
        }
        return Anzahl;
    }
}