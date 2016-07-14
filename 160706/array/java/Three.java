import java.util.Arrays;

public class Three {
    public static void main(String args[]){
        int[] array=new int[]{1,3,2};
        do_sort(array);
    }
    public static void do_sort(int[] ary){
        Arrays.sort(ary);
        for(int i =0;i<ary.length;i++)
          System.out.println(ary[i]);
    }
}
