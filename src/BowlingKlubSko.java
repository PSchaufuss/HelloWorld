public class BowlingKlubSko
{
    public static void main(String[] args)
    {
        Person patrick = new Person("Jørgensen", "Patrick", 43.5);
        Person thomas = new Person("Hansen", "Thomas", 42.5);
        Person hussain = new Person("Mahmoud", "Hussain", 43.5);

        patrick.udskrivPerson();
        thomas.udskrivPerson();
        hussain.udskrivPerson();

        System.out.println(patrick); // Læg mærke til @Override i 'Person' koden. Den bliver returneret her grundet toString()
    }

}
