public class StringLength {
    public static void main(String[] args) {
      String s="Hello World";
      //By using inbuild method
//        System.out.println(s.length());
        //By without inbuild method
        s=s.concat("\0");
        char a[]=s.toCharArray();
        int count=0;
        int i=0;
        while(a[i]!=0){
            ++count;
            ++i;
        }
        System.out.println(count);

    }
}
