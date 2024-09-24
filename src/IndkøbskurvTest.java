public class IndkøbskurvTest
{
    public static void main(String[] args)
    {
        Vare mælk = new Vare("Mælk", 7);
        Vare brød = new Vare("Brød", 15);
        Vare mel = new Vare ("Mel", 20);
        Vare kaffe = new Vare ("Kaffe", 40);
        Vare ost = new Vare ("Ost", 35);

        Ordrelinje ordre1 = new Ordrelinje(mælk, 3);
        Ordrelinje ordre2 = new Ordrelinje(brød, 2);
        Ordrelinje ordre3 = new Ordrelinje(kaffe, 1);
        Ordrelinje ordre4 = new Ordrelinje(mel, 1);

        Indkøbskurv kurv = new Indkøbskurv();
        kurv.tilføjOrdrelinje(ordre3);
        kurv.tilføjOrdrelinje(ordre4);
        kurv.tilføjOrdrelinje(ordre1);
        kurv.tilføjOrdrelinje(ordre2);

        System.out.println(kurv.toString());

    }
}
