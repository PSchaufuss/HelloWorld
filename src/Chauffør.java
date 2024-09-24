public class Chauffør
{
    private String navn; // felt til Chauffør-navn

    public Chauffør(String navn) // Konstruktør
    {
        this.navn = navn;
    }

    public String getNavn() // Metode til at returnere navnet
    {
        return navn;
    }

    public String toString()
    {
        return "Chauffør [Navn: " + navn + "]";
    }
}
