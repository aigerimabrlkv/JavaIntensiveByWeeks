package week6;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args){
        // List, Set, Map
        List<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        list.add(1,  300);
        for( int i=0; i < list.size(); ++i){
            System.out.println(list.get(i));
        }
    }
}
