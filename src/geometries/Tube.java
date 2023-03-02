package geometries;

import primitives.Point;
import primitives.Ray;
import primitives.Vector;

/** The Tube class inherits from RadialGeometry and represents a three-dimensional body and is based on radius and ray
 * system
 * @author Tzofiya and Shira */
public class Tube extends RadialGeometry{
    Ray axisRay;

    public Tube(double radius)
    {
        super(radius);
    }

    public Vector getNormal(Point p1) {
        return null;
    }

    public Ray getAxisRay()
    {
        return axisRay;
    }
}
