
public class Eight{
    public static void main(String args[]){
        int a = 25;
        count_money(a);
    }

    public static void count_money(int n){
      int twenty_five_max = n / 25;
      for(int i =0;i<=twenty_five_max;i++){
        int twenty_five_yushu = n - 25*i;
        int ten_max = twenty_five_yushu / 10;
        for(int m =0;m<=ten_max;m++){
          int ten_yushu = twenty_five_yushu - 10 * m;
          int five_max = ten_yushu / 5;
          for(int x = 0; x<=five_max; x++){
            int five_yushu = ten_yushu - 5 * x;
            int one_max = five_yushu / 1;
            System.out.println("25x"+i+" 10x"+m+" 5x"+x+" 1x"+one_max);
          }
        }
      }
    }
}
