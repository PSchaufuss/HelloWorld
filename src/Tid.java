public class Tid
{
public static void main(String[] args)
    {
        int hour = 9;
        int minut = 56;
        int seconds = 32;
        String space = " ";

        System.out.println("\n" + "Klokken er " + hour + ":" + minut + ":" + seconds + space + "eller" + space + minut + space + "minutter" + space + "og" + space + seconds + space + "sekunder" + space + "over" + space + hour);

        int totalSecondsTodaySoFar = ((9*60*60)+(56*60)+(32));

        System.out.println("\n" + "Siden midnat er der gået " + totalSecondsTodaySoFar + space + "sekunder");

        int hourEnd = 10;
        int minutEnd = 8;
        int secondsEnd = 20;

        int totalSecondsEndOfTask = ((10*60*60)+(8*60)+(20));
        int totalMinutsEndOfTask = (totalSecondsEndOfTask/60);
        int totalSecondsToDoTask = (totalSecondsEndOfTask-totalSecondsTodaySoFar);
        int totalMinutsToDoTask = (totalSecondsToDoTask/60);

        System.out.println("\n" + "Der er gået" + space + totalSecondsToDoTask + space + "sekunder, eller " + totalMinutsToDoTask + space + "minutter med at lave opgaven.");
    }
}
