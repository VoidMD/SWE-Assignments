public class Rectangular extends Shape {

    private double height;
    private double length;
    private double width;

    public Rectangular(double height , double length , double width){
        if(length < 0){
            throw new IllegalArgumentException("Wrong input");
        }
        else if(width < 0){
            throw new IllegalArgumentException("Wrong input");
        }
        else if(height < 0){
            throw new IllegalArgumentException("Wrong input");
        }
        else {
            this.length = length;
            this.width = width;
            this.height = height;
        }

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
