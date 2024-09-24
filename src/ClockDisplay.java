public class ClockDisplay
{
// Attributter
    private NumberDisplay hours; // Holder styr på timerne (0-23)
    private NumberDisplay minutes; // Holder styr på minutterne (0-59)
    private String displayString; // Klokkens visning i formatet "HH;MM"

    // Constructor
    public ClockDisplay()
    {
        // Initialiserer timer (limit 24) og minutter (limit 60)
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay(); // opdaterer displayString til at vise "00:00" ved start
    }

    public void timeTick()
    {
        minutes.increment(); // Øger minutter med 1
        if(minutes.getValue() == 0) // Hvis minutter er 0, betyder det, at en time er gået
        {
            hours.increment(); // Øger timerne med 1, når minutterne når 0.
        }
        updateDisplay(); // Opdaterer displayString til den nye tid
    }
    public String getTime()
    {
        return displayString; // Returnerer displayString, som repræsenterer tiden
    }

    private void updateDisplay()
    {
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue(); // Sætter displayString til det aktuelle klokkeslæt i formatet HH;MM
    }
}
