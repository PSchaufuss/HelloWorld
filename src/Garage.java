import java.util.ArrayList;

public class Garage
{
    private ArrayList<Car> bilerne = new ArrayList<Car>(); //Danner Arraylist for biler

    public void tilføjBil(Car bil)
    {
        bilerne.add(bil); //Tilføjer bil til min ArrayList
    }

    public double beregnPrisForAlleBiler() // Opretter metode til at beregne samlet pris for garagen
    {
        double samletPris = 0.0;

        for (Car bil : bilerne)
        {
            samletPris += bil.nypris(); //Antager at nypris() er bilens pris
        }
        return samletPris;
    }

}
