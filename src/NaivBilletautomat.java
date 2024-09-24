public class NaivBilletautomat
{ // Attributter
    private int pris;
    private int saldo;
    private int total;

    public NaivBilletautomat(int billetPris)  // Constructor
    {
        this.pris = billetPris; // Initialiserer prisen fra argumentet (se private int længere oppe)
        this.saldo = 0;
        this.total = 0;
    }

    public int getPris()
    {
        return pris;
    }

    public int getSaldo()
    {
        return saldo;
    }

    public int getTotal()
    {
        return total;
    }

    public void indbetal(int kroner)
    {
        saldo += kroner; //Tilføj indbetalte penge til saldoen
        System.out.println("Du har indbetalt: " + kroner + " kr,-");
    }

        public void printBillet()
        {
            if (saldo >= pris)
            {
                System.out.println("####################");
                System.out.println("# Billet til " + pris + " kr,-");
                System.out.println("####################");
                total += pris; // Opdater total med prisen for en billet
                saldo -= pris; // Træk billetprisen fra saldoen)
            }
            else
            {
                System.out.println("Du har ikke nok penge. Mangler: " + (pris - saldo) + " kr,-");
            }
        }
    }



