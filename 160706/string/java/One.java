import java.util.Arrays;

/**
 * Created by lbc on 2016/7/14.
 */
public class One{
    public static void main(String args[]){

        String a = "abcdahj";
        String b = "a";
        transform_ary(a, b);
    }

    public static void transform_ary(String a, String b)
    {
        String [] stringArr = a.split(b);
        System.out.println(Arrays.toString(stringArr));
        for(int i = 0 ; i < stringArr.length; i++)
            System.out.println(stringArr[i]);
    }
}
