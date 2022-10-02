public class Amstrong {
    public static void main(String[] args) {

        int n=153,sum=0,r;
        int temp=n;

        while(n>0){
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;
        }if(temp==sum){
            System.out.println("the num is amstromg");
        }else
            System.out.println("the num is not amstrong");
    }
}
