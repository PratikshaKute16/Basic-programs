//import java.util.Scanner;
import java.util.*;

public class Test1 {
    //public static void main(String[] args) {

        public static Double addValues (Double[]values){
            Scanner sc = new Scanner(System.in);
            int size=sc.nextInt();
            int Number[]=new int[size];
            double result=0;
            System.out.println("Enter the values:");
            for(int i=1;i<=size;i++)
            {
                Number[i]=sc.nextInt();
            }
            if(Number.length==0){
                return null;
            } else
                for( int i=1;i<=size;i++){
                    result=result+Number[i];
                }
                     return result ;




    }
}