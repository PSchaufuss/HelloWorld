import java.util.Scanner;

public class StuderendeTestMain
{
    public static void main(String[] args)
    {
        HoldStuderende hold = new HoldStuderende(); // Opretter hold

        hold.tilføjStuderende(new Studerende("Anne Hansen", "anna@mail.dk"));
        hold.tilføjStuderende(new Studerende("Lars Nielsen", "lars@mail.dk"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Indtast navnet på den studerende du vil søge efter: ");
        String navn = scanner.nextLine();

        Studerende fundetStuderende = hold.søgStuderende(navn);

        if (fundetStuderende != null)
        {
            System.out.println("Studerende fundet: " + fundetStuderende);
            System.out.println("Ønsker du at redigere denne studerendes oplysninger? (ja/nej): ");

            String svar = scanner.nextLine();

            if (svar.equalsIgnoreCase("ja"))
            {
                System.out.println("Indtast nyt navn: ");
                String nytNavn = scanner.nextLine();
                System.out.println("Indtast ny email: ");
                String nyEmail = scanner.nextLine();

                fundetStuderende.setNavn(nytNavn);
                fundetStuderende.setEmail(nyEmail);

                System.out.println("Studerende opdateret: " + fundetStuderende);
            }
            else
            {
                System.out.println("\nAlle studerende på holdet:");
                System.out.println(hold);

                scanner.close();
            }
        }
    }
}
