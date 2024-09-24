public class FirkantTest
{
    public static void main(String[] args)
    {
        Square firkant = new Square(3.5, 4.2);

        double areal = firkant.beregnAreal();
        System.out.println(areal);

        Square firkantTo = new Square(5.6, 5.6);
        System.out.println(firkantTo.beregnAreal());

        System.out.println("\n" + firkant.HvilkenSlagsFirkant());
        System.out.println(firkantTo.HvilkenSlagsFirkant());
    }
}

