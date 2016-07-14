import java.util.Arrays;

public class Four {
    public static void main(String args[]){
        int[] array=new int[]{1,3,2};
        do_sort(array);
    }
    public static void do_sort(int[] ary){
        Arrays.sort(ary);
        for(int i =ary.length-1;i>-1;i--)
          System.out.println(ary[i]);
    }
}