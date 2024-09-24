import java.util.Scanner;

public class SkoledageEllerWeekend
{
    enum Ugedag
    {
        MANDAG,
        TIRSDAG,
        ONSDAG,
        TORSDAG,
        FREDAG,
        LØRDAG,
        SØNDAG
    }

    public static void main(String[] args)
    {
            int brugerValg = -1;

            Scanner scanner = new Scanner(System.in);

        System.out.println("Vælg en dag i ugen ved at indtaste et tal fra 1-7:");
        System.out.println("1. MANDAG");
        System.out.println("2. TIRSDAG");
        System.out.println("3. ONSDAG");
        System.out.println("4: TORSDAG");
        System.out.println("5: FREDAG");
        System.out.println("6: LØRDAG");
        System.out.println("7: SØNDAG");

        boolean gyldigtValg = false;
        while (!gyldigtValg)
        {
            System.out.println("Indtast et tal: ");
            if (scanner.hasNextInt())
            {
                brugerValg = scanner.nextInt();
                if (brugerValg >= 1 && brugerValg <= 7)
                {
                    gyldigtValg = true;
                }
                else
                {
                    System.out.println("Du må kun skrive et tal fra 1-7. Prøv igen.");
                    scanner.next(); // Input ryddes, så næste forsøg er læsbar
                }
            }

        }

        Ugedag ugedag = null; // Opretter en variabel af typen ugedag. Jeg sætter den til null som initialisering. Det er for at have en reference-instans, som vi kan hente.

        switch (brugerValg)
        {
            case 1:
                ugedag = Ugedag.MANDAG;
                break;
            case 2:
                ugedag = Ugedag.TIRSDAG;
                break;
            case 3:
                ugedag = Ugedag.ONSDAG;
                break;
            case 4:
                ugedag = Ugedag.TORSDAG;
                break;
            case 5:
                ugedag = Ugedag.FREDAG;
                break;
            case 6:
                ugedag = Ugedag.LØRDAG;
                break;
            case 7:
                ugedag = Ugedag.SØNDAG;
                break;
        }

        if (ugedag != null)
        {
            if (ugedag == Ugedag.MANDAG || ugedag == Ugedag.TIRSDAG || ugedag == Ugedag.ONSDAG || ugedag == Ugedag.TORSDAG || ugedag == Ugedag.FREDAG)
        {
            System.out.println("Op og i gang, du skal i skole.");
        }
            if (ugedag == Ugedag.MANDAG)
            {
                System.out.println("Jeg ved godt, at det er mandag igen. Hold ud, det er kun 5 dage.");
            }
            if (ugedag == Ugedag.FREDAG)
            {
                System.out.println(" .. Men du har weekend, når du har fri!");
            }
        }
        else if (ugedag == Ugedag.LØRDAG || ugedag == Ugedag.SØNDAG)
        {
            System.out.println("Det er weekend, sov du bare videre. ;-)");
        }


        if (ugedag != null) //Tjekker om det er hverdag eller weekend. != null, da den ellers skriver fejlmeldingen noteret i String ovenfor
        {
            switch (ugedag)
            {
                case MANDAG, TIRSDAG, ONSDAG, TORSDAG, FREDAG:
                    System.out.println("Det er hverdag!");
                    break;
                case LØRDAG, SØNDAG:
                    System.out.println("Det er weekend!");
                    break;
            }
        }



        scanner.close();
    }
}
