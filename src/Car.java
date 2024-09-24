public class Car
{
    private String farve; // Bilens data (inkl. to nedenstående)
    private int kørteKilometer;
    private double nyPris;
    private Chauffør chauffør; // Nyt felt til chauffør. Jeg oprettede dette element til bil-klassen efter jeg havde oprettet den nye chauffør klasse.

    public Car(String farve, double nyPris)
    {
        this.farve = farve;
        this.nyPris = nyPris;
        this.kørteKilometer = 0; // Fordi en ny bil har kørt 0 km,-
        this.chauffør = null; // Ingen chauffør ved bilens oprettelse. Den kommer først senere, derfor Null.
    }

    public void kør(int antalKilometer) // Metode til at opdatere antal kørte kilometer
    {
        if (antalKilometer > 0)
        {
            this.kørteKilometer += antalKilometer;
        }
        else
        {
            System.out.println("Antal kørte kilometer skal være positivt.");
        }
    }

    public double nypris() // Metode til at returnere bilens nypris
    {
        return this.nyPris;
    }

    public String toString() // Opretter metode til at give beskrivelse af bilen
    {
        return "Bil [Farve: " + farve + ", Kørte kilometer: " + kørteKilometer + nyPris + "]";
    }

    public boolean enChaufførSætterSigInd(Chauffør c)
    {
        if (this.chauffør == null)  // Kun hvis der ikke allerede sidder en chauffør
        {
            this.chauffør = c;
            return true; //chaufførsætter sig ind
        }
        else
        {
            return false; // Der er allerede en chauffør
        }
    }

    public Chauffør hvemKørerBilen()
    {
        return this.chauffør;
    }

    public Chauffør chaufførStigerUd()
    {
        if (this.chauffør != null)
        {
            Chauffør afgåetChauffør = this.chauffør;
            this.chauffør = null; // Chaufføren forlader bilen
            return afgåetChauffør; // Returner den chauffør, der steg ud
        }
        else
        {
            return null; // Ingen chauffør at fjerne
        }

    }

}
