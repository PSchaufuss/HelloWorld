public class kontoTest
{
    public static void main(String[] args)
    {
        Konto konto1 = new Konto(); // Opretter konto med standard værdier
        System.out.println(konto1.toString());

        Konto konto2 = new Konto("13579", "Jørgensen, Patrick"); // -..- med kontonummer og ejernavn
        System.out.println(konto2.toString());

        Konto konto3 = new Konto("13579", "Jørgensen, Patrick", 1000);
        System.out.println(konto3.toString());

        konto3.indsæt(500);
        System.out.println("Ny saldo efter indsættelse: " + konto3.getSaldo());

        if (konto3.hæv(200) == -1)
        {
            System.out.println("Der er ikke nok penge til at gennemføre udtrækket.");
        }
        else
        {
            System.out.println("Ny saldo efter hævning: " + konto3.getSaldo());
        }
    }
}
