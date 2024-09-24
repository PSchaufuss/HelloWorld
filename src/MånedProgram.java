import java.util.Scanner;

public class MånedProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indtast en måned (fx JANUAR, FEBRUAR..): ");
        String input = scanner.next().toUpperCase(); // Gør brugerinput til store bogstaver.

        Måned valgtMåned = Måned.valueOf(input); // Konverterer brugerinput til enum-type

        bestemSæson(valgtMåned);
    }

    public static void bestemSæson (Måned måned)  // Opretter en switch til bestemmelse af sæson
    {
        switch (måned)
        {
            case MARTS, APRIL, MAJ -> System.out.println("Det er forår!");
            case JUNI, JULI, AUGUST -> System.out.println("Det er sommer!");
            case SEPTEMBER, OKTOBER, NOVEMBER -> System.out.println("Det er efterår!");
            case DECEMBER, JANUAR, FEBRUAR -> System.out.println("Det er vinter!");
            default -> System.out.println("Ukendt måned!");
        }
    }
}

