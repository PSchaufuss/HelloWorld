public class IterateThroughArray // Opgave 1: Lav en klasse
{
    public static void main(String[] args)
    {

        // Opgave 2: Lav et double-array med værdierne {4.5, 25.3, 1.2, 34.0, 15.5}
        double[] array = {4.5, 25.3, 1.2, 34.0, 15.5};

        // Opgave 3: For-loops
        // Koden er udkommenteret

        System.out.println("Værdierne i anden potens:");
        for (int i = 0; i < array.length; i++)
        {
            double kvadreret = Math.pow(array[i], 2); // Opløft til anden potens
            System.out.println(array[i] + " i anden potens er: " + kvadreret);
        }

        // Opgave 6: Find den mindste værdi i arrayet
        double minValue = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] < minValue)
            {
                minValue = array[i];
            }
        }
        System.out.println("minimumsværdien i arrayet er: " + minValue);

        // Opgave 7: Find den største værdi i arrayet
        double maxValue = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > maxValue)
            {
                maxValue = array[i];
            }
        }
        System.out.println("Minimumsværdien i arrayet er " + minValue);

        // Opgave 8: Led efter værdien 12.1 i arrayet

        boolean found = false;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == 12.1)
            {
                System.out.println("Hurra! Jeg fandt 12.2. Det stod på indeks " + i);
                found = true;
                break; // Stop loopet, når vi har fundet værdien
            }
        }
        if (!found)
        {
            System.out.println("Værdien 12.1 blev ikke fundet i arrayet.");
        }
    }
}
