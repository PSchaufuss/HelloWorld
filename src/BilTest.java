import java.util.ArrayList;

public class BilTest
{
   /* public static void main(String[] args)
    {
        Car minBil = new Car("Sort", 250000);
        System.out.println(minBil);

        Chauffør chauffør1 = new Chauffør("Christian");

        if (minBil.enChaufførSætterSigInd(chauffør1))
        {
            System.out.println(chauffør1.getNavn() + " kører bilen nu.");
        }
        else
        {
            System.out.println("Bilen har allerede en chauffør.");
        }

        // Henter information om hvem der kører bilen
        System.out.println("Chaufføren der kører bilen er: " + minBil.hvemKørerBilen());

        // Chaufføren forlader bilen
        Chauffør afgåetChauffør = minBil.chaufførStigerUd();
        if (afgåetChauffør != null)
        {
            System.out.println(afgåetChauffør.getNavn() + " er steget ud af bilen.");
        }
        else
        {
            System.out.println("Der var ingen chauffør i bilen.");
        }

        minBil.kør(100);
        System.out.println(minBil);
    } */

    public static void main(String[] args)
    {
        Garage minGarage = new Garage(); // Opretter ny garage

        // Opretter biler
        Car toyota = new Car("Gul", 100000);
        Car mercedes = new Car("Blank Sort", 300000);
        Car renault = new Car("Rød", 150000);

        // Tilføjer biler til garage
        minGarage.tilføjBil(toyota);
        minGarage.tilføjBil(mercedes);
        minGarage.tilføjBil(renault);


        double samletPris = minGarage.beregnPrisForAlleBiler();
        System.out.println("Den samlede pris for alle biler i garagen, er: " + samletPris);
    }
}
