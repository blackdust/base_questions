import java.util.ArrayList;

public class Six {
    public static void main(String args[]){
        ArrayList array = new ArrayList();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        rand_ary(array);
    }
    public static void rand_ary(ArrayList ary){
        int index;
        int a[] = new int[ary.size()];
        int times = ary.size();

        for (int i = 0; i < times; i++) {
            index = (int) (Math.random() * ary.size());

            a[i] = (int) ary.get(index);        
            ary.remove(index);
        }

        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }
}