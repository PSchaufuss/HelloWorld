public class Terningspil
{
    public static void main(String[] args)
    {
        Terning terningEt = new Terning();
        Terning terningTo = new Terning();

        int slagEt, slagTo;

        while (true)
        {
            slagEt = terningEt.roll();
            slagTo = terningTo.roll();

            System.out.println(slagEt);
            System.out.println(slagTo);

            if (slagEt == 1 && slagTo == 1)
            {
                System.out.println("Du har fået Snake Eyes!");
                System.out.println("Good game");
                break;
            }
        }

        System.out.println("Værdien af terningEt: " + terningEt.roll());
        System.out.println("Værdien af terningTo: " + terningTo.roll());




    }
}
