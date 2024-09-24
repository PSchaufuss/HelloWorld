import java.util.Scanner;

public class BmiBeregner
{
    public static void main(String[] args)

    {
        Scanner input = new Scanner (System.in);
        System.out.println("For at udregne din BMI, bedes du indtaste din højde i meter og vægt i kg");

        System.out.print("Højde i meter: ");
        double height = input.nextDouble();

        System.out.print("Vægt i kg: ");
        double weight = input.nextDouble();

        double BMI = ((weight)/(height*height));

        //BMI = vægt(kg) / højde(m)*2
        System.out.println("Du har en BMI på " + BMI);

        //Under 18,5: Undervægtig
        //18,5-25: Normalvægtig
        //25-30: Overvægtig
        //Over 30: Svært overvægtig

        if (BMI < 18.5)
        {
            System.out.println("Du er undervægtig.");
        }
        else if (BMI >= 18.5 && BMI < 25)
        {
            System.out.println("Du er normalvægtig.");
        }
        else if (BMI >= 25 && BMI < 30)
        {
            System.out.println("Du er overvægtig.");
        }
        else
        {
            System.out.println("Du er svært overvægtig.");
        }
    }

}
