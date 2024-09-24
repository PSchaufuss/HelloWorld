public class CirkelTest
{
    public static void main(String[] args)
    {
       Cirkel cirkelEt = new Cirkel(5.5);
       double arealEt = cirkelEt.beregnAreal();
        System.out.println("\n cirkelEt har et areal på " + arealEt + ".");

        Cirkel cirkelTo = new Cirkel(11.0);
        double arealTo = cirkelTo.beregnAreal();
        System.out.println("\n cirkelTo har et areal på " + arealTo + ".");
    }
}
