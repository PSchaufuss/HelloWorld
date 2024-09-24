import java.util.Scanner;

public class studentGPAVideoPractice
{
    public static void main(String[] args)
    {
        double studentGrade = 7.45;
        String studentFirstName = "Patrick";
        String studentLastName = "Joergensen";

        System.out.println("\n" + studentFirstName + " " + studentLastName + " har et karaktergennemsnit på " + studentGrade);
        System.out.println("Hvad ønsker du at hæve dit gennemsnit til?");

        Scanner input = new Scanner(System.in);
        studentGrade = input.nextDouble();
        System.out.println("\n" + studentFirstName + " " + studentLastName + " har nu et karaktergennemsnit på " + studentGrade);
    }


}
