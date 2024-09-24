import java.util.Scanner;
import java.util.Random;

public class GuessNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(1,11); //Man kan også skrive int numberToGuess = rand.nextInt(10) + 1; -> Hvis vi skriver (10), er det tallene under. Derfor 0 til 9. Vi starter på 0-indeks, og skriver derfor +1.
        // numberToGuess = 4; //Dette var oprindeligt aktivt, men vi har deaktiveret det, for at aktivere det tilfældige tal.
        int userGuess = -1; //Vi har givet den en værdi uden for det interval.
        int numberOfGuesses = 1; //antal gæt


        System.out.println("Gæt et tal mellem 1 og 10! Skriv dit gæt og tryk enter.");
        System.out.print("Gæt: ");

        userGuess = input.nextInt();

        while (userGuess != numberToGuess) //Når userGuess IKKE er numberToGuess sker det der ses nedenfor
        {
            if (userGuess > numberToGuess) // Hvis userGuess er større end numberToGuess
            {
                System.out.println("Det var forkert. Tallet du skal gætte er lavere end dit gæt.");
                System.out.print("\n" + "Gæt: ");
                userGuess = input.nextInt(); //Aktivering af Scanner. Det næste der skal ske, er user input.
            }
            if (userGuess < numberToGuess)
            {
                System.out.println("Det var forkert. Tallet du skal gætte er højere end dit gæt.");
                System.out.print("\n" + "Gæt: ");
                userGuess = input.nextInt();
            }
            numberOfGuesses++; //numberOfGuesses = numberOfGuesses + 1 -> Det er det samme
        }

        System.out.println("Du gættede rigtigt! Det tal, som jeg tænkte på, var: " + numberToGuess + ". Sejt!" + "\n- Og forresten, så brugte du kun " + numberOfGuesses + " gæt!");

    }
}
