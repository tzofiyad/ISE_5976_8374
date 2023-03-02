package primitives;

import java.util.Objects;


public class Ray
{
    private Point p0;
    private Vector dir;

    @Override
    public String toString() {
        return "Ray{" +
                "p0=" + p0 +
                ", dir=" + dir +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ray ray = (Ray) o;
        return Objects.equals(p0, ray.p0) && Objects.equals(dir, ray.dir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(p0, dir);
    }

    public Ray(Point p0, Vector v1)
    {
        this.p0 = p0;
        this.dir = v1;
    }

    public Point getP0() {
        return p0;
    }

    public Vector getDir() {
        return dir;
    }
}
