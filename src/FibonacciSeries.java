import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num1=1,num2=1;
        System.out.print("enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("1 1 ");
         int sum=0;

        while(sum<=n){
            sum = num1 + num2;
             if(sum>=n)
                break;
            System.out.print(sum + " ");
                num1 = num2;
                num2 = sum;
        }


    }
}
