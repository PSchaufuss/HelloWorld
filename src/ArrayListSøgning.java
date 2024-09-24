import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSøgning
{
    public static void main(String[] args)
    {

        ArrayList<Integer> tabel2 = new ArrayList<>(Arrays.asList(2, 5, 7, 4, 8, 11, 45, 23, 76, 34, 45, 44, 55, 77, 99, 2, 5));

        int søgeTal = 5;

        boolean fundet = false;
        for (int i = 0; i < tabel2.size(); i++) {
            if (tabel2.get(i) == søgeTal) {
                System.out.println("Fundet på position: " + i);
                fundet = true;
                break;
            }
        }
        if (!fundet){
            System.out.println("Elementet blev ikke fundet");
        }

    }
}
