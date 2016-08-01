
public class Five{
    public static void main(String args[]){
        int a = 4;
        total_rabbits(a);
    }

    public static void total_rabbits(int month_count){
        int[] arg = new int[month_count];
        if (month_count > 2){
            arg[0]=1;
            arg[1]=1;
            int count  = 2;
            for(int x = 3; x<= month_count; x++){
                arg[x-1] = arg[x-2]+arg[x-3];
                count += arg[x-1];
            }
            System.out.println(month_count + "月后一共有"+ count*2 + "只兔子");
        }else{
            System.out.println(month_count + "月后一共有"+ 1*2 + "只兔子");
        }
    }
}