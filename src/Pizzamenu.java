import java.util.Scanner;

public class Pizzamenu
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int brugerValg = -1;
        boolean gyldigtValg = false;

        System.out.println("Vælg hvad du ønsker fra menúen. Du har 4 valg: ");
        System.out.println("1. Margherita");
        System.out.println("2. Vesuvio");
        System.out.println("3. Hawaii");
        System.out.println("4. Pepperoni");



        while (!gyldigtValg)
        {
            System.out.println("Indtast menu-nummeret på den pizza, som du ønsker: ");

            if(scanner.hasNextInt())
            {
                brugerValg = scanner.nextInt();
                if (brugerValg >= 1 && brugerValg <= 4)
                {
                    gyldigtValg = true;
                }
                else
                {
                    System.out.println("Du har ikke valgt en pizza fra menúen.");
                    scanner.next();
                }

                switch (brugerValg)
                {
                    case 1:
                        System.out.println("Du har valgt en Margherita.");
                        break;
                    case 2:
                        System.out.println("Du har valgt en Vesuvio.");
                        break;
                    case 3:
                        System.out.println("Du har valgt en Hawaii.");
                        break;
                    case 4:
                        System.out.println("Du har valgt en Pepperoni.");
                        break;
                }
                scanner.close();
            }

        }

    }
}
