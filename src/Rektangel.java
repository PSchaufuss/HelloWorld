public class Rektangel
{
   private double længde;
   private double bredde;

   public Rektangel()
   {
        længde = 0;
        bredde = 0;
   }

   public Rektangel(double længde, double bredde)
   {
       setBredde(bredde);
       setLængde(længde);
   }

   public double beregnOmkreds()
   {
       return (2 * længde + 2 * bredde);
   }

   public double beregnAreal()
   {
       return længde * bredde;
   }

   public double getLængde()
   {
       return længde;
   }

   public void setLængde(double længde)
   {
       this.længde = længde;
   }

   public double getBredde()
   {
       return bredde;
   }

   public void setBredde(double bredde)
   {
       this.bredde = bredde;
   }
}
