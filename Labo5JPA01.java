import java.util.Scanner;

public class Labo5JPA01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Input n (0<=n<=16):");
            int num  = input.nextInt(); 
            if (num == 999) {
                break;
            }else if (0 < num && num < 17) {
                System.out.println(num+"的階乘 = "+calculate(num));
                
            }else{
                System.out.println("error");
            }
        }
        input.close();
    }

    public static int calculate(int num){
       
        if(num==0){
            return 1;
        }else{
            return num*calculate(num-1);
        }
    }
}
