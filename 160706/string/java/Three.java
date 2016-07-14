
public class Three{
    public static void main(String args[]){
        String str = "A";
        int time = 4;
        make_str(str, time);
    }

    public static void make_str(String str, Integer time)
    {
        String strs = "";
        for(int i = 0 ; i < time; i++)
            strs += str;
        System.out.println(strs);
    }
}