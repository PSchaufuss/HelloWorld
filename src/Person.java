public class Person
{
    String forNavn;
    String efterNavn;
    double skoStørrelse;

    public Person(String forNavn, String efterNavn, double skoStørrelse)
    {
        this.forNavn = forNavn;
        this.efterNavn = efterNavn;
        this.skoStørrelse = skoStørrelse;

    }
    public void udskrivPerson()
    {
        System.out.println("Navn: " + efterNavn + ", " + forNavn + "." + " Skostørrelse: " + skoStørrelse);
    }

    @Override // @Override bruges til at sige, "Hey, jeg vil skrive over noget eksisterende data"
    public String toString()
    {
        return ("Navn: " + efterNavn + ", " + forNavn + "." + " Skostørrelse: " + skoStørrelse);
    }
}
