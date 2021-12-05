import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        boolean flag = true;
        Scanner input = new Scanner(System.in);

        do {
            try {
                switch (getMenuChoice()) {
                    case 1:
                        System.out.println("Please enter x and y :");
                        System.out.println(new complexNumberFactory().makeComplexNumber("V",input.nextInt(),input.nextInt()));

                        break;

                    case 2:

                        System.out.println("Please enter x and y :");
                        System.out.println(new complexNumberFactory().makeComplexNumber("P",input.nextInt(),input.nextInt()));

                        break;

                    case 3:
                        System.out.println("Terminating ... ");
                        System.exit(0);
                        break;
                }
            }catch(Exception ex){
                System.err.println("Error: Wrong operation! "+ex);
            }
        } while (flag) ;

    }

    public static  int  getMenuChoice(){
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("Please select the operation: ");
            System.out.println("1. Complex number in vector form");
            System.out.println("2. Complex number in polar form");
            System.out.println("3. Exit");

            choice = scanner.nextInt();
            if(choice < 1 || choice > 3)
                System.err.println("Error: Wrong operation!");
        }while(choice < 1 || choice > 3);

        return choice;
    }

}
