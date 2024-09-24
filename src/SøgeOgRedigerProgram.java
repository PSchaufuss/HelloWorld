import java.util.ArrayList;
import java.util.Scanner;

public class SøgeOgRedigerProgram {
    public static void main(String[] args) {
        // Opretter en liste af personer i databasen
        ArrayList<Person> personDatabase = new ArrayList<>();
        personDatabase.add(new Person("Ulla", "Jensen", 40));
        personDatabase.add(new Person("Lilian", "Jensen", 41));
        personDatabase.add(new Person("Johnny", "Hammermanden", 43));

        String søgeNavn = "Jensen"; // Navn, vi leder efter
        ArrayList<Person> søgeResultat = new ArrayList<>();

        // Søg efter personer med efternavnet "Jensen"
        for (Person p : personDatabase) {
            if (p.efterNavn.equalsIgnoreCase(søgeNavn)) {
                søgeResultat.add(p);
            }
        }

        // Tjek om der er nogen resultater og udskriv dem
        if (!søgeResultat.isEmpty()) {
            for (Person person : søgeResultat) {
                System.out.println(person);
            }
            // Hvis resultater findes, tilbyder vi mulighed for at redigere
            redigerPerson(søgeResultat);  // Flyttet her for korrekt placering
        } else {
            System.out.println("Der findes ingen personer i listen med efternavnet: \"" + søgeNavn + "\"");
        }
    }

    // Metode til at redigere en valgt person
    public static void redigerPerson(ArrayList<Person> søgeResultat) {
        Scanner scanner = new Scanner(System.in);

        // Udskriv søgeresultater med nummerering
        for (int i = 0; i < søgeResultat.size(); i++) {
            System.out.println((i + 1) + ": " + søgeResultat.get(i));
        }

        // Brugeren vælger, hvilken person der skal redigeres
        System.out.println("Indtast nr på den person, som skal redigeres:");
        int nr = scanner.nextInt();
        scanner.nextLine(); // Ryd scannerens buffer

        // Hent den valgte person
        Person editPerson = søgeResultat.get(nr - 1);
        System.out.println("Redigerer: " + editPerson);

        // Brugeren indtaster nye data eller trykker ENTER for at beholde de gamle værdier
        System.out.println("Indtast nyt fornavn (eller tryk ENTER for at beholde):");
        String nytForNavn = scanner.nextLine();
        if (!nytForNavn.isEmpty()) {
            editPerson.forNavn = nytForNavn;
        }


        System.out.println("Redigeret person: " + editPerson);
    }
}


/* import java.util.ArrayList;
import java.util.Scanner;

public class SøgeOgRedigerProgram
{
    public static void main(String[] args)
    {
        ArrayList<Person> personDatabase = new ArrayList<>();
        personDatabase.add(new Person("Ulla", "Jensen", 40));
        personDatabase.add(new Person("Lilian", "Jensen", 41));
        personDatabase.add(new Person("Johnny", "Hammermanden", 43));

        String søgeNavn = "Jensen";

        ArrayList<Person> søgeResultat = new ArrayList<>();

        for (Person p : personDatabase)
        {
            if (p.efterNavn.equalsIgnoreCase(søgeNavn)) {
                søgeResultat.add(p);
            }
        }
            if (!søgeResultat.isEmpty())
            {
                for (Person person : søgeResultat)
                {
                    System.out.println(person);
                }
                redigerPerson(søgeResultat);
            }
            else
            {
                System.out.println("Der findes ingen personer i listen med efternavnet: \"" + søgeNavn + "\"");
            }






                public static void redigerPerson(ArrayList<Person> søgeResultat)
            {
                Scanner scanner = new Scanner(System.in);

                for (int i = 0; i < søgeResultat.size(); i++)
                {
                    System.out.println((i + 1) + ": " + søgeResultat.get(i));
                }

                System.out.println("Indtast nr på den person, som skal redigeres:");
                int nr = scanner.nextInt();
                scanner.nextLine();

                Person editPerson = søgeResultat.get(nr - 1);
                System.out.println("Redigerer: " + editPerson);

                System.out.println("Indtast nyt fornavn (eller tryk ENTER for at beholde):");
                String nytForNavn = scanner.nextLine();
                if (!nytForNavn.isEmpty())
                {
                    editPerson.forNavn = nytForNavn;
                }
            }

    }
} */


