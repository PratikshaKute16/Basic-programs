import javax.swing.*;

public class hollowPyramid {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for (int k=1;k<=7;k++) {
                if (i + k == 5|| k-i==3 ||i==4) {
                    System.out.print("*");
                }else
                    System.out.print(" ");
            }
            System.out.println( );
        }
    }
}
