public class Main {
    public static void main(String[] args) {
        Shape s1 = new Cylinder(1,1);
        Shape s2 = new Rectangular(1,1,Math.PI);
        System.out.println(s1.getHeight());
        System.out.println(s1.calculateVolume());
        System.out.println(s2.calculateVolume());
        s1.compareTo(s2);
    }
}
