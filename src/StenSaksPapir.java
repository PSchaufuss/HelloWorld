/*
Step 1: Bruger introduceres til spillet med String
Step 2: Bruger vælger 'sten', 'saks' eller 'papir
Step 3: Computer vælger en tilfældig af de tre muligheder
Step 4: Informer spiller om computerens valg, og hvem der har vundet eller uafgjort
 */

import java.util.Scanner;
import java.util.Random;

public class StenSaksPapir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int brugerPoints = 0; //Brugerens point
        int computerPoints = 0; //Computerens point
        int runder = 0; //Antal runder i spillet

        while (brugerPoints < 2 && computerPoints < 2)
        {
            runder++;
            System.out.println("Runde " + runder + ": Vælg 'sten', 'saks' eller 'papir': ");
            String brugerValg = scanner.next().toLowerCase(); // Brugerens input


            System.out.println("Vælg 'sten', 'saks' eller 'papir': ");


            int computerValgNummer = random.nextInt(3);
            String computerValg = "";

            if (computerValgNummer == 0) //inde i paranteser, står condition
            {
                computerValg = "sten";
            } else if (computerValgNummer == 1) {
                computerValg = "saks";
            } else if (computerValgNummer == 2) {
                computerValg = "papir";
            }
            System.out.println("Computerens valg: " + computerValg);

            if (brugerValg.equals(computerValg))
            {
                System.out.println("Det blev uafgjort.");
            }
            else if ((brugerValg.equals("sten") && computerValg.equals("saks")
                    || brugerValg.equals("saks") && computerValg.equals("papir")
                    || brugerValg.equals("papir") && computerValg.equals("sten")))
            {
                brugerPoints++;
                System.out.println("Du vandt!");
            }
            else if ((brugerValg.equals("sten") && computerValg.equals("papir")
                    || brugerValg.equals("saks") && computerValg.equals("sten")
                    || brugerValg.equals("papir") && computerValg.equals("saks")))
            {
                computerPoints++;
                System.out.println("Computeren vandt!");
            }
            System.out.println("Stilling: Bruger " + brugerPoints + " - Computer " + computerPoints);
            System.out.println("-----------------------");
        }

        if (brugerPoints == 2)
        {
            System.out.println("Tillyke! Du vandt bedst af tre.");
        }
        else
        {
            System.out.println("Desværre, computeren vandt bedst af tre.");
        }

        scanner.close(); // Scanner lukkes


    }
}
