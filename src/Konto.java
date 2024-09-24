public class Konto
{
private String kontonummer; // Instansvariable
private String ejernavn; // -..-
private double saldo; // -..-

public Konto() //Standard konstruktør
{
    this.kontonummer = "Ukendt";
    this.ejernavn = "Ukendt";
    this.saldo = 0.0;
}

public Konto(String kontonummer, String ejernavn)  //Konstruktør m. parametre
{
    this.kontonummer = kontonummer;
    this.ejernavn = ejernavn;
    this.saldo = 0.0;
}

public Konto(String kontonummer, String ejernavn, double startsaldo) //Konstruktør m. flere parametre
{
    this.kontonummer = kontonummer;
    this.ejernavn = ejernavn;
    this.saldo = startsaldo;
}

    public String getKontonummer()
{
    return kontonummer;
}

public String getEjernavn()
{
    return ejernavn;
}

public double getSaldo()
{
    return saldo;
}

public void setKontonummer(String kontonummer)
{
    this.kontonummer = kontonummer;
}

public void setEjernavn(String ejernavn)
{
    this.ejernavn = ejernavn;
}

public void setSaldo(double saldo)
{
    this.saldo = saldo;
}

public double indsæt(double beløb)  // Metode oprettes til at kunne indsætte penge
{
    if (beløb > 0)
    {
        this.saldo += beløb;
    }
    return this.saldo;
}

public double hæv(double beløb)
{
    if (beløb > 0 && beløb <= this.saldo)
    {
        this.saldo -= beløb;
        return this.saldo;
    }
    else
    {
        return -1;
    }
}

public String toString() //toString metode til udskrivning af info om konto
{
    return "Kontonummer: " + this.kontonummer + ", Ejer: " + this.ejernavn + ", Saldo: " + this.saldo;
}

}
