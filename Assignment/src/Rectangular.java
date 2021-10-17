
public class Rectangular implements Shape {

    private double height;
    private double length;
    private double width;

    public Rectangular(){

    }

    public Rectangular(double height , double length , double width){
        this.length = length;
        this.width = width;
        setHeight(height);


    }


    @Override
    public void setHeight(double height) {
        this.height = height;
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
