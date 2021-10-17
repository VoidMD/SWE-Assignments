public class Cylinder implements Shape {
    private double radius;
    private double height;

    public Cylinder() {

    }

    public Cylinder(double radius, double height) {
        this.radius=radius;
        setHeight(height);
    }

    @Override
    public void setHeight(double height) {
        this.height=height;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}
