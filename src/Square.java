public class Square
{
    double height;
    double side;

    public Square(double height, double side)
    {
        this.height = height;
        this.side = side;
    }

    public double beregnAreal()
    {
        return (height*side);
    }

    public String HvilkenSlagsFirkant()
    {
        if(height == side)
        {
            return "Din firkant er et kvadrat";
        }
        else
        {
            return "Din firkant er et rektangel";
        }
    }

}
