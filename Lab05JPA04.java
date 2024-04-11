import java.util.Scanner;

public class Lab05JPA04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number :");
        int m = input.nextInt();
        if (m > 0) {
            System.out.println("Ans:"+sum2(m));
            
        }else{
            System.out.println("error");
        }
        input.close();
    }

    public static int sum2(int m){
        int sum = 0;
        if (m == 1) {
            return 2;
        }else{
             sum += sum2(m-1)+2*m;
             return sum ;
        }
    }
}
