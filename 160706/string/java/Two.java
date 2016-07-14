import java.util.Arrays;

public class Two{
    public static void main(String args[]){

        String [] stringArr = {"AAA","BBB","CCC"};
        make_str(stringArr);
    }

    public static void make_str(String [] a)
    {
        String str = "";
        for(int i = 0 ; i < a.length; i++)
            str += a[i];
        System.out.println(str);
    }
}
