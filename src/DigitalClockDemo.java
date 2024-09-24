public class DigitalClockDemo
{
    public static void main(String[] args)
    {
        ClockDisplay clock = new ClockDisplay(); // Opretter uret
        for (int i = 0; i < 61; i++) // Simulerer 1500 minutter, hvor i vækster løbende
        {
            clock.timeTick(); // Øger tiden med et minut
            System.out.println("Klokken er: " + clock.getTime()); // Udskriver den aktuelle tid
        }

        /* ClockDisplay hourClock = new ClockDisplay();
        for (int i = 0; i < 1500; i+=60);
        {
            hourClock.timeTick();
            System.out.println(hourClock.getTime());
        } */

    }

}
