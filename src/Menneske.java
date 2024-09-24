public class Menneske
{
    private Menneske ægtefælle;

    public Menneske getÆgtefælle()  //Opretter getter metode
    {
        return ægtefælle;
    }

    public void setÆgtefælle(Menneske ægtefælle)
    {
        this.ægtefælle = ægtefælle;
    }

    public void gifterSigMed(Menneske andetMenneske) // Sikrer sig, at man ikke kan gifte sig, med sig selv
    {
        if (this == andetMenneske)
        {
            System.out.println("Du kan ikke gifte dig med dig selv.");
        }

        if (this.ægtefælle == null && andetMenneske.getÆgtefælle() == null)
        {
            this.setÆgtefælle(andetMenneske); //Sætter ægtefællen til den anden person
            andetMenneske.setÆgtefælle(this); // Sætter den anden persons ægtefælle til 'this'
            System.out.println("Tillykke! I er nu gift!");
        }
        else
        {
            System.out.println("En af jer er desværre allerede gift.");
        }
        }
        public void bliverSkilt()
    {
        if (this.ægtefælle != null) // Hvis man er gift, fjernes ægtefællerne for begge parter
        {
            Menneske tidligereÆgtefælle = this.ægtefælle; //Gemmer den nuværende ægtefælle
            tidligereÆgtefælle.setÆgtefælle(null); // Fjerne ægtefællen for den tidligere ægtefælle
            System.out.println("I er nu skilt!");
        }
        else
        {
            System.out.println("Du er ikke gift, og kan derfor ikke skilles.");
        }

    }

}
