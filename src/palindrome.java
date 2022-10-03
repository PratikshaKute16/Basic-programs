import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int n,rev=0,r;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the num");
        n=sc.nextInt();
        int temp=n;

        while (n > 0) {
                r = n % 10;
                n = n / 10;
                rev = rev * 10 + r;
        }if(temp==rev){
            System.out.println("The num is palindrome");
        }else
            System.out.println("The num is not palindrome");
    }
}
