import java.util.Scanner;

public class Tidberegner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Hvor mange timer, minutter og sekunder er der gået, siden midnat?");

        System.out.print("Timer: ");
        int timer = input.nextInt();
        System.out.print("Minutter: ");
        int minutter = input.nextInt();
        System.out.print("Sekunder: ");
        int sekunder = input.nextInt();

        System.out.println("Der er gået " + timer + " timer, " + minutter + " minutter og " + sekunder + " sekunder siden midnat.");


    }
}
