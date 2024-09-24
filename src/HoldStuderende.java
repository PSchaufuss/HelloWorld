import java.util.ArrayList;

public class HoldStuderende
{

    private ArrayList<Studerende> studerendeListe;

    public HoldStuderende()  // Konstruktør for Arraylisten
    {
        studerendeListe = new ArrayList<>();
    }

    public void tilføjStuderende(Studerende studerende) // Metode til tilføjelse til listen
    {
        studerendeListe.add(studerende);
    }

    public Studerende søgStuderende(String navn)
    {
        for (Studerende studerende : studerendeListe)
        {
            if (studerende.getNavn().equalsIgnoreCase(navn))
            {
                return studerende;
            }
        }
        return null; // Returnerer 'null' hvis den ikke finder studerende
    }

    public String toString() // Opretter toString metode til alle i holdet
    {
        StringBuilder sb = new StringBuilder();
        for (Studerende studerende : studerendeListe)
        {
            sb.append(studerende).append("\n");
        }
        return sb.toString();
    }



}
