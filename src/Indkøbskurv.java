import java.util.ArrayList;

public class Indkøbskurv
{
    private ArrayList<Ordrelinje> ordrelinjer;

    public Indkøbskurv()  // Konstruktør
    {
        ordrelinjer = new ArrayList<>(); // Starter ArrayListen
    }

    public void tilføjOrdrelinje(Ordrelinje ordrelinje) // Metode til tilføjelse af ordrelinje
    {
        ordrelinjer.add(ordrelinje);
    }

    public double beregnSamletPris()  // Metode til at beregne samlet pris
    {
        double samletPris = 0;
        for (Ordrelinje ordrelinje : ordrelinjer)
        {
            samletPris += ordrelinje.beregnTotalPris();
        }
        return samletPris;
    }

    public String toString() // toString-metode til at vise information
    {
        StringBuilder str = new StringBuilder();
        for (Ordrelinje ordrelinje : ordrelinjer)
        {
            str.append(ordrelinje.toString()).append("\n");
        }

        str.append("Samlet pris: ").append(beregnSamletPris()).append(" kr,-");
        return str.toString();
    }
}
