import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class Ten {
    public static void main(String args[]){
        ArrayList<String> strArray1 = new ArrayList<String> (){{add("a"); add("b");add("c");add("d");}};
        ArrayList<String> strArray2 = new ArrayList<String> (){{add("a"); add("b");add("c");add("f");}};
        set_hash(strArray1, strArray2);
    }

    public static void set_hash(ArrayList ary1, ArrayList ary2){
        HashMap<String , Boolean> map = new HashMap<String , Boolean>();
        for(int i = 0; i< ary1.size() ; i++){
            String str = (String) ary1.get(i);
            map.put(str, true);
        }
        for(int i = 0; i < ary2.size(); i++){
            String str2 = (String) ary2.get(i);
            if(map.get(str2) == null){
                map.put(str2, true);
            }
        }
        Iterator it = map.keySet().iterator();
        while(it.hasNext()) {
            String key = (String)it.next();
            System.out.println(key);
        }
    }
}