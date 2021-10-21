public class Rectangular extends Shape {

    private double height;
    private double length;
    private double width;

    public Rectangular() {
        this.height = 1;
        this.width = 1;
        this.length = 1;

        calculateVolume();
    }

    public Rectangular(double height, double length, double width) {
        if (length < 0) {
            throw new IllegalArgumentException("Wrong input");
        } else if (width < 0) {
            throw new IllegalArgumentException("Wrong input");
        } else if (height < 0) {
            throw new IllegalArgumentException("Wrong input");
        }

        this.length = length;
        this.width = width;
        this.height = height;

        calculateVolume();

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
        super.volume = getHeight() * length * width;
        return getHeight() * length * width;
    }


}
