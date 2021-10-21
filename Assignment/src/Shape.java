public abstract class Shape implements Comparable<Shape> {
    public double volume;
    public int compareTo(Shape o) {
            if (volume > o.volume){
                System.out.println("Different volume ");
                return 1;}
            else if (volume < o.volume){
                System.out.println("Different volume ");
                return -1;}
            else{
                System.out.println("Same volume ");
                return 0;}
        }

    public abstract double getHeight();
    public abstract double calculateVolume();
    public abstract void setHeight(double height);

}
