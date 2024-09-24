public class Ordrelinje
{
    private Vare vare;
    private int antal;


    public Ordrelinje(Vare vare, int antal) // Konstruktøren
    {
        this.vare = vare;
        this.antal = antal;
    }

    public double beregnTotalPris() // Metode til beregn og returnering af totalpris
    {
        return vare.getPris() * antal;
    }

    public String toString() // toString-metode til at vise ordreinfo
    {
        return antal + " x " + vare.toString() + " = " + beregnTotalPris() + " kr,-";
    }

}
