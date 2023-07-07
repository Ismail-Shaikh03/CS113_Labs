public class Cylinder extends Shape
{
    private double radius;
    private double height;

    public Cylinder(double r,double newHeight)
    {
        super("Cylinder");
        radius = r;
        height = newHeight;
    }

    public double area()
    {
        return (Math.PI*radius*radius)*height;
    }


    public String toString()
    {
        return super.toString() + " of radius " + radius + " with height " + height;
    }
}