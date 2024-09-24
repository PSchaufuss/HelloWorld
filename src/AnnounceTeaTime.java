import java.util.Scanner;

public class AnnounceTeaTime
{
    public static void announceTeaTime()
    {
        System.out.println("Witing for tea time...");
        System.out.println("Type in a random word and press Enter" + " to start tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's tea time!");
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to your new job");
        announceTeaTime();

        System.out.println("Write code");
        System.out.println("Review code");
        System.out.println("Learn stuff");

        announceTeaTime();

        System.out.println("Get promoted!");
    }
}
