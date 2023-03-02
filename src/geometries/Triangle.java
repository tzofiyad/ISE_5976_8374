package geometries;

import primitives.Point;

/** The triangle class represents a flat body and inherits from the polygon class
 * system
 * @author Tzofiya and Shira */
public class Triangle extends Polygon
{
    /**
     * A constructor that receives three points and activates the parent constructor accordingly
     * @param q0 the apex of the triangle
     * @param q1 the apex of the triangle
     * @param q2 the apex of the triangle
     */
    public Triangle(Point q0, Point q1, Point q2) {
        super(q0,q1,q2);
    }
}
