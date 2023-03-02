package primitives;

public class Vector extends Point
{

    public Vector(double d1, double d2, double d3)
    {
        super(d1, d2, d3);
        Double3 p1 = new Double3(d1,d2,d3);
        if (p1.equals(p1.ZERO))
            throw new IllegalArgumentException("ERROR: the vector equals to zero");
    }

    Vector(Double3 xyz)
    {
        super(xyz);
        if (xyz.equals(Double3.ZERO))
            throw new IllegalArgumentException("ERROR: the vector equals to zero");
    }

    @Override
    public String toString()
    {
        return "Vector{}";
    }

    public Vector add(Vector v1)
    {
        return new Vector(xyz.add(v1.xyz));
    }
    public Vector scale(double num)
    {
        return new Vector(xyz.scale(num));
    }
    public Vector crossProduct(Vector v1)
    {
        return new Vector(xyz.d2 *v1.xyz.d3 - xyz.d3 * v1.xyz.d2, xyz.d3 *v1.xyz.d1 - xyz.d1 * v1.xyz.d3,xyz.d1 *v1.xyz.d2 - xyz.d2 * v1.xyz.d1);
    }
    public double lengthSquared()
    {
        return xyz.d1* xyz.d1 + xyz.d2* xyz.d2 + xyz.d3* xyz.d3;
    }
    public double length()
    {
        return Math.sqrt(lengthSquared());
    }
    public Vector normalize()
    {
        double lengthVec = Math.sqrt(dotProduct(this));
        return this.scale(1/lengthVec);

    }
    public double dotProduct(Vector v1)
    {
        return xyz.d1*v1.xyz.d1 + xyz.d2*v1.xyz.d2 + xyz.d3*v1.xyz.d3;
    }





}
