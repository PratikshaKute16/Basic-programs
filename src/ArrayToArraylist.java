import java.util.*;

public class ArrayToArraylist {
    public static void main(String[] args) {
        String [] s={"Apple","Ball","Cat"};
//        List list= Arrays.asList(s);
//        System.out.println(list);
        List<String> l= new ArrayList<>();
//        Collections.addAll(l,s);
//        System.out.println(l);
        for(String string:s){
            l.add(string) ;
        }
        System.out.println(l);


    }
}
