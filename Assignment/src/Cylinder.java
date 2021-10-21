public class Cylinder extends Shape {
    private double radius;
    private double height;
    private double volume;

    public Cylinder() {
        this.radius=1;
        this.height=1;
    }

    public Cylinder(double radius, double height) {
        if (radius<= 0){
            throw new IllegalArgumentException("wrong input");
        }
        this.radius=radius;
        this.height=height;
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
    public double calculateVolume() {
        super.volume = getHeight()*(Math.PI*radius*radius);
        return getHeight()*(Math.PI*radius*radius);
    }


}
