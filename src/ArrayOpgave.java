public class ArrayOpgave
{
    public static void main(String[] args)
    {
        // Opgave 2: Lav et tomt array, som kan indeholde 8 elementer af typen int
        int[] intArray = new int[8];

        // Opgave 3: Assign værdien 34 på den første plads i arrayet, og assign værdien 117 på den sidste plads i arrayet.
        intArray[0] = 34; //Første plads (indeks 0)
        intArray[intArray.length - 1] = 117; // Sidste plads (indeks 7)

        // Opgave 4: Skriv et for-loop der itererer over arrayet og udskriver alle værdierne. Hvad udskrives?
        System.out.println("Værdier i intArray:");
        for (int i = 0; i < intArray.length; i++)
        {
            System.out.print(intArray[i] + " "); // Udskriver værdierne med mellemrum
        }
        System.out.println(); // Ny linje efter udskrivning. Da vi kun har tildest indeks 0 og 7 værdier, har de andre vædierne 0.

        // Opgave 5: Lav et array med Strings
        String[] strArray = {"Hej", "med", "dig"}; //String array med tre elementer

        // Opgave 6: For each-loop der udskriver med mellemrum mellem ordene
        System.out.println("Udskrift af strArray");
        for (String word : strArray)
        {
            System.out.println(word + " ");
        }
        System.out.println(); // Ny linje

        // Opgave 7: Lav et array med doubles
        double[] doubleArray = {3.4, 2.5, 1.2, 6.7};

        System.out.println("Værdi på indeks 2 i doubleArray: " + doubleArray[2]); // Udskriv værdi på indeks 2
        System.out.println("Længden af doubleArray: " + doubleArray.length); // Udskriv længde på Arrayet

    }
}
