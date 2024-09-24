import java.util.Scanner;

public class ForLoopsOpgave
{
    public static void main(String[] args)
    {

        for(int i = 1; i<=4; i++)
        {
            int resultat = 2*i;
            System.out.println("2 gange " + i + " = " + resultat + "\n");
        }

        for(int i=1; i<=6; i++) // for(int startVærdi; måIkkeBlive; vækstBetingelser){}
        {
            int resultat = 2*i;
            System.out.print(resultat + " ");
        }

        System.out.println();

        for(int i = 4; i<=79; i+=15) //Denne linje er for-loopets signatur.
        {
            System.out.print(i + " ");
        }

        System.out.println();

        for(int i=30; i>=-20; i-=10)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        for(int i=-7; i<=13; i+=4)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        for(int i=97; i>=82; i-=3)
        {
            System.out.print(i + " ");
        }
    }
}
