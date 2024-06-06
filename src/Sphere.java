public class Sphere {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double calculateVolume() {
        //double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius ;
        return (4.0 / 3.0) * Math.PI * radius * radius * radius ;
    }

    public double calculateSurfaceArea() {
        //double surfaceArea = 4.0 * Math.PI * radius * radius ;
        return 4.0 * Math.PI * radius * radius ;
    }

    public  double calculateCircumference() {
        return 2.0 * Math.PI * radius ;
    }

    public double getRadius() {
        return radius;
    }
}


