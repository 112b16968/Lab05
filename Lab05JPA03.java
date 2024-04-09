import java.util.Scanner;

public class Lab05JPA03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Input m :");
            int number1 = input.nextInt();
            
            if (number1 == 999) {
                break;
            }
            System.out.print("Input n :");
            int number2 = input.nextInt();
            System.out.println("最大公因數="+calculate(number1, number2));
        }

        input.close();
    }

    public static int calculate (int m , int n){
        if (n==0) {
            return m;
        }else{
            return calculate(n, m%n);
        }
    }
}
