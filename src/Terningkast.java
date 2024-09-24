import java.util.Random;

public class Terningkast
{
    public static void main(String[] args)
    {
        Random rand = new Random();

        int sum = 0;
        int numberOfThrows = 0; // Vigtigt at denne står uden for while{}, da det ellers ikke vil virke i while funktionen
        int terning1 = rand.nextInt(1,7);
        int terning2 = rand.nextInt(1,7);

        while (sum != 7)
        {

            sum = terning1 + terning2;

            System.out.println(terning1 + " + " + terning2 + " = " + sum);
            // Systeom.out.printf("\n%d + %d = %d", terningeKast1, terningeKast2, sum)
            // %f = Float = Decimaltal
            // %.2f = Float = Decimaltal, hvor du beskriver hvor mange decimaler
            // %s = String = Tekst
            // %d = int = hele tal


            numberOfThrows++;


        }

        System.out.println("\n Det tog " + numberOfThrows + " kast, at få værdien 7 som sum af de to terningers værdier.");
    }

}
