import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Ten{
    public static void main(String args[]){
        String  a  = "你a你b";
        String  p  = "[a-z]";
        String  p2  = "[0-9]";
        System.out.println(get_index(a, p));
        System.out.println(get_index(a, p2));
    }

    public static Integer get_index(String a, String  p)
    {
        Pattern pattern =  Pattern.compile(p);
        Matcher matcher = pattern.matcher(a);
        if(matcher.find()){
           return matcher.start();
        }else{
           return -1;
        }         
    }
}