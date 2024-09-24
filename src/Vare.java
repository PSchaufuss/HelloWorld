public class Vare
{
    private String navn;
    private double pris;

    public Vare(String navn, double pris)  // Opretter konstruktør
    {
        this.navn = navn;
        this.pris = pris;
    }

    public double getPris() // Opretter Getter
    {
        return pris;
    }

    public String toString() // Laver min toString for at vise informationen om varerne, uden at skulle skrive en hel String
    {
        return navn + ", " + pris + " kr,-";
    }
}
