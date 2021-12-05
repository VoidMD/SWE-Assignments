public class complexNumberFactory {

    public complexNumber makeComplexNumber(String type, int m , int n){
        complexNumber newNumber = null;

        if(type.equals("V")){
            return new Vector(m,n);
        }
        if(type.equals("P")){
            return new Polar(m,n);
        }else return null;

    }
}
