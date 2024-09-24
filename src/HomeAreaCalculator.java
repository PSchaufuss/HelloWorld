public class HomeAreaCalculator
{
    public static void main(String[] args)
    {
        Rektangel room1 = new Rektangel();
        room1.setBredde(25);
        room1.setLængde(50);
        double areaOfRoom1 = room1.beregnAreal();

        Rektangel room2 = new Rektangel(30, 75);
        double areaOfRoom2 = room2.beregnAreal();
    }
}
