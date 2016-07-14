
import java.util.ArrayList;



public class Four{
    public static void main(String args[]){
        String str = "ABCD";
        reverse_str(str);
    }

    public static void reverse_str(String str)
    {
        char [] a = str.toCharArray();
        ArrayList<String> strArray = new ArrayList();
        for(int i = a.length-1 ; i >= 0; i--){
            strArray.add(String.valueOf(a[i]));
        }
        System.out.println(strArray);
        // 

    }
}