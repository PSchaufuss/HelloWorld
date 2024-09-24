public class NaivBilletautomatDemo
{
    public static void main(String[] args)
    {
        NaivBilletautomat automat = new NaivBilletautomat(10); // Billetautomat med pris på 10kr,-

        automat.indbetal(5); //indsætter 5kr,-
        automat.printBillet(); //forsøger at printe billet uden held

        automat.indbetal(25); //indsætter 25kr,- yderligere)
        automat.printBillet(); // Printer igen

        System.out.println("Saldo efter køb: " + automat.getSaldo());
        System.out.println("Total modtaget af automaten: " + automat.getTotal());
    }
}
