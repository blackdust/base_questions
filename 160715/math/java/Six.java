
public class Six{
    public static void main(String args[]){
        int a = 10;
        Decimal_conversion(a,2);
        Decimal_conversion(a,3);
        Decimal_conversion(a,6);
    }

    public static void Decimal_conversion(int num, int a){
        int length = get_length(num , a);
        int yushu  = num;
        String x = "";

        for(int time = length ; time >=1; time--){
            int basic_num_from_this_layer = (int) Math.pow(a,time-1);
            int result = yushu / basic_num_from_this_layer;
            yushu = yushu%basic_num_from_this_layer;
            x+= String.valueOf(result);
        }
        System.out.println(x);

    }
    public static int get_length(int num, int a){
        int _num = 0;
        int n = 0;
        while(_num < num){
            _num = (int) Math.pow(a,n);
            n++;
        }
        return n-1;
    }
}