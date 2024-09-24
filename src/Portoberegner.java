import java.util.Scanner;

public class Portoberegner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Angiv dit brevs vægt i gram, for at beregne prisen i porto");

        int pris;

        System.out.print("Vægt: ");
        int weight = input.nextInt();

        // 0-249g = 25kr,-
        // 250-499g = 50kr,-
        // 500-2000g = 75kr,-

        if (weight <= 0)
        {
            System.out.println("Du kan ikke have et brev, som vejer 0 gram. Indtast en ny værdi.");
        }
        else if (weight < 250)
        {
            pris = 25;
            System.out.println(pris + "kr,-");
        }
        else if (weight >= 250 && weight < 500)
        {
            pris = 50;
            System.out.println(pris + "kr,-");
        }
        else if (weight >= 500 && weight < 2001)
        {
            pris = 75;
            System.out.println(pris + "kr,-");
        }
        else
        {
            System.out.println("Dette brev overholder ikke kravene for vægt ved forsendelse. Det kan desværre ikke sendes.");
        }


    }
}
