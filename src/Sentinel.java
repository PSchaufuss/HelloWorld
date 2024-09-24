import java.util.Scanner;

public class Sentinel // En Sentinel betyder, at når brugeren indtaser -1, så stopper ens loop.
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); //Scanner oprettes, så at brugeres kan komme med input

        final int SENTINEL = -1; //Denne værdi signalerer slutningen af en sekvens af indtastninger fra brugeren. Vi sætter den som -1. Final indikerer blot, at det er en konstant, og at den ikke ændres.
        int sum = 0; //Opretter variablen 'sum', som starter med at være 0. Den skal bruges til at gemme summen af de tal, som indtastes
        int input = 0;

        while (input != SENTINEL)
        {
            sum += input; //lægger input til sum
            System.out.println("Indtast tal. (indtast -1 for at stoppe): ");
            input = scanner.nextInt(); // her beder vi om nyt tal
        }
        System.out.println("Summen af tallene er: " + sum);
        scanner.close();
    }
}
