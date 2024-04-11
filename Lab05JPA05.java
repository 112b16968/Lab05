import java.util.Scanner;

public class Lab05JPA05 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Adding two integer: ");
        String intString = input.nextLine();
        String[] intArray = intString.split(",");
        int a1 = Integer.parseInt(intArray[0]);
        int a2 = Integer.parseInt(intArray[1]);
        

        System.out.print("Adding two doubles: ");
        String doubleString = input.nextLine();
        String[]  doubuleArray = doubleString.split(",");
        double b1 = Double.parseDouble(doubuleArray[0]);
        double b2 = Double.parseDouble(doubuleArray[1]);
        

        System.out.print("Adding two strings: ");
        String stringString = input.nextLine();
        String[] stringArray = stringString.split(",");
        String c1 = stringArray[0];
        String c2 = stringArray[1];
        

        add(a1, a2);
        add(b1, b2);
        add(c1, c2); 
    }

    public static void add(int a1 , int a2){
        System.out.print(a1 + a2+" ");
    }

    public static void add(double b1 , double b2){
        System.out.print(b1+b2+" ");
    }

    public static void add(String c1 , String c2){
        System.out.print(c1+" "+c2);
    }
}
