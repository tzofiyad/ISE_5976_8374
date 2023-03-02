package geometries;
import primitives.Vector;
import primitives.Point;


/** The cylinder class represents a three-dimensional body and based on height
 * system
 * @author Tzofiya and Shira */
public class Cylinder extends Tube
{
    /** represents the height of the cylinder */
    private double height;

    /**
     * A constructor that receives the radius value and initializes it with the help of the father
     * @param radius   The radius value
     */
    public Cylinder(double radius)
    {
        super(radius);
    }

    /**
     *Implementing the getNormal action of the Geometry interface
     * @param p1 A point in a cylinder
     * @return  at this point returns null
     */
    public Vector getNormal(Point p1)
    {
        return null;
    }

    /**
     *getter operation
     * @return height The height of the cylinder
     */
    public double getHeight()
    {
        return height;
    }
}
