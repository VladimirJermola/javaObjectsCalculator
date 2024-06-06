public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double calculateTotalSurface() {
        //double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius ;
        return (2.0 * Math.PI * radius * radius + 2.0 * Math.PI * radius * height) ;
    }

    public double calculateLateralSurface() {
        //double surfaceArea = 4.0 * Math.PI * radius * radius ;
        return 2.0 * Math.PI * radius * height;
    }

    public  double calculateVolume() {
        return Math.PI * radius * radius * height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }
}
