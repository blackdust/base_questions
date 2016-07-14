import java.util.ArrayList;
import java.util.HashMap;

public class Eight {
    public static void main(String args[]){
        ArrayList<String> strArray = new ArrayList<String> (){{add("a"); add("b");add("c");add("d");}};
        set_hash(strArray);
    }

    public static void set_hash(ArrayList ary){
        HashMap<String , String> map = new HashMap<String , String>();
        for(int i = 0; i < ary.size() - 1; i++) {
            String str = (String) ary.get(i);
            String str1 = (String) ary.get(i + 1);
            map.put(str, str1);
        }
        System.out.println(map);
    }
}