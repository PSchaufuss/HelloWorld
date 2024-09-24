public class NumberDisplay
{
    private int limit; // Grænsen for hvor højt tallet kan nå, før det ændres til 0
    private int value; // Den akutelle værdi, som kan være mellem 0 og limit-1

    public NumberDisplay(int rollOverLimit)
    {
        limit = rollOverLimit; // Definerer græsen for, hvornår value skal rulle over til 0
        value = 0;  // Sætte den initiale værdi af 'value' til 0
    }

    public int getValue() // Getter metode for at få den aktuelle værdi
    {
        return value; // Returnerer den aktuelle værdi af attributtens value
    }

    public String getDisplayValue() // Getter metode for at få display-værdien som en string
    {
        if (value < 10) {
            return "0" + value; // Hvis værdi er mindre end 10, viser den som tocifret (f.eks. 09)
        }

        else
        {
            return "" + value; // Ellers returneres værdien, som den er.
        }
    }

        public void setValue(int replacementValue) // Setter metode for at sætte en ny værdi
        {
            if (replacementValue >= 0 && replacementValue < limit) // Sikrer at værdien er inden for det tilladte interval
            {
                value = replacementValue; // Opdaterer value med dets nye værdi
            }
        }

        public void increment() // Metode til at inkrementere værdien
        {
            value = (value + 1) % limit; // Øger value med 1. Hvis den overstiger limit, så starter den forfra på 0 igen.
        }
    }

