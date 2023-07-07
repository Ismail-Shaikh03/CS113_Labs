public class Rectangle extends Shape
{
    private double length;
    private double width;

    public Rectangle(double newSide1, double newSide2)
    {
        super("Rectangle");
        length= newSide1;
        width= newSide2;
    }

    public double area()
    {
        return length*width;
    }


    public String toString()
    {
        return super.toString() + " of side lengths " + length + ", " + width;
    }
}