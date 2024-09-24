import java.sql.SQLOutput;

public class hjemmeOpgaveDatatyper
{
public static void main(String[] args)
    {
        final int minutsEachHour = 60;
        int percent = 100;
        int minuts = 52;
        int minutsPercent = ((minuts*percent)/minutsEachHour);


        System.out.println("\n"+"Opgave 1 \n Klokken er 15:52. Der er derfor gået "+minutsPercent+"% af den nuværende time.");

        double percentDouble = 100;
        final double minutsEachHourDouble = 60;
        double minutsDecimal = 52;
        double minutsOfHour = (minutsDecimal/minutsEachHourDouble);
        System.out.println("\n"+"Opgave 2 + 3 \n Brøkdelen af timen, der er gået, er: "+minutsOfHour);
        System.out.println("\n"+"Opgave 4 \n Koden er blevet omskrevet, så at literals, (tal el. ord der optræder uden præsentation), er defineret.");


    }
}
