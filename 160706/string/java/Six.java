

public class Six{
    public static void main(String args[]){
        String a = "123";
        String b = "1234";
        System.out.println(return_shorter_str(a, b));
    }

    public static String return_shorter_str(String a, String b)
    {
        String shorter_str = "";
        if(a.length() > b.length())
        {shorter_str = b;}else{shorter_str = a;}
        return shorter_str;
    }
}