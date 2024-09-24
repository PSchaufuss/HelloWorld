import java.util.Scanner;

public class TommeBeregner
{
    public static void main(String[] args)
    {
        final double TommeTilCM = 2.54;

        Scanner input = new Scanner(System.in);
        System.out.println("Angiv mængden af tommer, som skal omregnes til CM.");
        System.out.print("Tommer: ");

        double tommer = input.nextDouble();
        System.out.println("Det givende antal tommer svarer til " + (tommer * TommeTilCM) + " CM");

    }
}
