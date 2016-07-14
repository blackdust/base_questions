import java.util.Arrays;

public class Five{
    public static void main(String args[]){
        String a = "123";
        String b = "1234";
        System.out.println(return_longer_str(a, b));
    }

    public static String return_longer_str(String a, String b)
    {
        String longer_str = "";
        if(a.length() > b.length())
        {longer_str = a;}else{longer_str = b;}
        return longer_str;
    }
}
