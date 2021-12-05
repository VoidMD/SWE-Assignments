public class Polar extends complexNumber{
    double r,theta;
    int a,b;

    public Polar(int a , int b){
        this.a=a;
        this.b=b;
        calTheta(a,b);
        calR(a,b);

    }
    public double calTheta(int x , int y){
            setTheta(Math.atan(y/x));
        return Math.atan(y/x);
    }

    public double calR(int x ,int y){
        setR(Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setTheta(double theta) {
        this.theta = theta;
    }

    public double getR() {
        return r;
    }

    public double getTheta() {
        return theta;
    }

    @Override
    public String toString() {
        return "in polar form R = "+r+" Theta = "+theta;
    }
}
