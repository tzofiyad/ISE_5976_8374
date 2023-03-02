package primitives;
import java.util.Objects;
import java.lang.Math;

public class Point
{
    Double3 xyz;

    Point(Double3 xyz)
    {
        this.xyz = xyz;
    }
    public Point (double _d1,double _d2, double _d3)
    {
        xyz = new Double3(_d1,_d2,_d3);
    }

    @Override
    public String toString()
    {
        return "Point{" +
                "xyz=" + xyz +
                '}';
    }
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(xyz, point.xyz);
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(xyz);
    }

    public double distance(Point p1)
    {
        return Math.sqrt(distanceSquared(p1));
    }
    public double distanceSquared(Point p1)
    {
        return (xyz.d1- p1.xyz.d1)*(xyz.d1- p1.xyz.d1) +(xyz.d2- p1.xyz.d2)*(xyz.d2- p1.xyz.d2)+(xyz.d3- p1.xyz.d3)*(xyz.d3- p1.xyz.d3);
    }
    public Vector subtract(Point p2) {
        return new Vector((xyz.subtract(p2.xyz)));

    }
    public Point add(Vector v1)
    {
        return new Point(xyz.add(v1.xyz));
    }

}
