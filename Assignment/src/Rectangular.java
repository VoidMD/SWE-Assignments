public class Rectangular extends Shape {

    private double height;
    private double length;
    private double width;
    private double volume;


    public Rectangular(){

    }

    public Rectangular(double height , double length , double width){
        this.length = length;
        this.width = width;
        this.height = height;

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
    public double calculateVolume() {
        super.volume = getHeight()*length*width;
        return getHeight()*length*width;
    }


}
