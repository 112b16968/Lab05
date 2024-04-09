import java.util.Scanner;
public class Lab05JPA02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            int sum = 1;
            System.out.print("Input n (0<=n<=16):");
            int num  = input.nextInt(); 
            if (num == 999) {
                break;
            }else if (0 < num && num < 17) {
                System.out.println(num+"的階乘(迴圈) = "+calculate1(num));
                System.out.println(num+"的階乘(尾遞迴) = "+calculate2(num,sum));
                
            }else{
                System.out.println("error");
            }
        }
        input.close();
    }

    public static int calculate1(int num){
       
        if(num==0){
            return 1;
        }else{
            return num*calculate1(num-1);
        }
    }
    
    public static int calculate2(int num , int sum){
        if (num == 1) {
            return sum ;
        }else{
            return calculate2(num -1 , num*sum);
        }
    }
}
