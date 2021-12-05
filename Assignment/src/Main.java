public class Main {
    public static void main(String[] args) {
        Shape s1 = new Cylinder(3,2);
        Shape s2 = new Rectangular(3,6,5);
        System.out.println(s2.calculateVolume());

        s1.compareTo(s2);

        Shape s3 = new Cylinder(1,1);
        Shape s4 = new Rectangular(1,1,Math.PI);

        s3.compareTo(s4);

        Shape s5 = new Cylinder(-2,3);
        Shape s6 = new Rectangular(-2,2,13);

        s5.compareTo(s6);

    }
}
