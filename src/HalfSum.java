import java.util.Scanner;

public class HalfSum {
    public static void main(String[] args) {
        int sumRight = 0;
        System.out.println("Enter the num:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements:");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if(i<n/2)
            sumRight += a[i];

        }
        System.out.println("sum of first half:" + sumRight);

    }
}
