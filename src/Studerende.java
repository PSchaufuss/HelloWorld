public class Studerende
{
private String navn;
private String email;

public Studerende(String navn, String email) // Konstruktør
{
    this.navn = navn;
    this.email = email;
}

public String getNavn() // Gettere og settere for de to parametre
        {
            return navn;
        }

        public void setNavn(String navn)
        {
            this.navn = navn;
        }

        public String getEmail()
        {
            return email;
        }

        public void setEmail(String email)
        {
            this.email = email;
        }

        public String toString()
        {
            return "Navn: " + navn + ", Email: " + email;
        }
}


