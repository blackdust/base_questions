import java.util.ArrayList;
import java.util.HashMap;

public class Seven {
    public static void main(String args[]){
        ArrayList<String> strArray = new ArrayList<String> (){{add("a"); add("b");add("c");add("a");add("b");}};
        str_count(strArray);
    }

    public static void str_count(ArrayList ary){
        HashMap<String , Integer> map = new HashMap<String , Integer>();
        for(int i = 0; i < ary.size(); i++) {
            String str = (String) ary.get(i);
            if(map.get(str) == null){
              map.put(str, 1);
            }else{
              Integer put = map.get(str) +1;
              map.put(str, put);
            }
        }
        System.out.println(map);
    }
}