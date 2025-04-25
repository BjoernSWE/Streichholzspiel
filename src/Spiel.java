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
            ComZiehen();
            if(this.Streichholzanzahl <= 0)
            {
                Ausgabe.SpielerGewinnt();
                break;
            }
            SpielerZiehen();
            if(this.Streichholzanzahl <= 0)
            {
                Ausgabe.ComputerGewinnt();
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
            if(Anzahl == 1 || Anzahl == 2)
            {
                Anzahl = 1;
            }
            if(Anzahl == 3)
            {
                Anzahl = 2;
            }
            if(Anzahl == 0)
            {
                Anzahl = 3;
            }
        }
        else
        {
            Anzahl = Streichholzanzahl - 1;
            if(Anzahl == 0)
            {
                Anzahl = 1;
            }
        }
        return Anzahl;
    }
}