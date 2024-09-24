import java.util.Random;

public class Terning
{
    private final int MAX = 6;
    private int faceValue;
    Random random = new Random();

    public Terning()
    {
        faceValue = random.nextInt(MAX) + 1;
    }

    public int roll()
    {
        faceValue = random.nextInt(MAX) + 1;
        return faceValue;
    }

    public int getFaceValue()
    {
        return faceValue;
    }

}
