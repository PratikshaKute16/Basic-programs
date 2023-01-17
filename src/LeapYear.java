public class LeapYear {
    public static void main(String[] args) {


        int year=1998;
        if (year % 400 == 0) {
            System.out.println("Yes");
        } else if (year % 100 == 0) {
            System.out.println("No");
        } else if (year % 4 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }
}
