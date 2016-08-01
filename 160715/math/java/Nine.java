import java.util.ArrayList;
public class Nine{
    public static void main(String args[]){
        find_ancestor(16, 11);
    }

    public static Integer layer_count(int n){
        int x = 2;
        int y = 0;
        while(n >= Math.pow(x,y)){y++;}
        return y;
    }

    public static void find_ancestor(int m, int n){
        ArrayList ary = new ArrayList();
        ArrayList ary1 = new ArrayList();
        ary1.add(m);
        ary1.add(n);
        ArrayList ary2 = new ArrayList();
        ary2.add(layer_count(m));
        ary2.add(layer_count(n));
        ary.add(ary1);
        ary.add(ary2);

        if (ary2.get(0) == ary2.get(1)){
            System.out.println("祖先就是" + same_layer_find_ancestor((Integer) ary1.get(0), (Integer) ary1.get(1)));
        }else{
            int max_num = (Integer) ary1.get( ary2.indexOf((Integer) Math.max( layer_count(m), layer_count(n)) ) );
            int divisor = (int) Math.pow(2, (Integer) Math.max( layer_count(m), layer_count(n)) - (Integer) Math.min( layer_count(m), layer_count(n)));
            int max_to_min_layer_ancestor = max_num / divisor;

            if(max_to_min_layer_ancestor == (Integer) Math.min(m,n)){
                System.out.println("祖先就是"+ max_to_min_layer_ancestor);}
            else{
                System.out.println("祖先就是"+ same_layer_find_ancestor(max_to_min_layer_ancestor, (Integer) Math.min(m,n)));
            }
        }
    }
    public static Integer same_layer_find_ancestor(int num1, int num2){
        while(num1 != num2){ num1 = num1/2; num2 = num2/2;};
        return num1;
    }

}
