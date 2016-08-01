public class Three{
    public static void main(String args[]){
        int a = 4;
        count_meters(a);
    }

    public static double  rise_and_fall(int before_fall_height, int times){
        double a =  before_fall_height;
        double count = 0;
        for(int i = 1; i <= times ;  i++){
            count = count + a;
            a = a * 0.5;
        }
        System.out.println("第"+ (times+1)  +"次落地后，还会弹起"+ a/2);
        return count;
    }

    public static void count_meters(int n){
        int first_fall_meters = 100;
        double meters_count = rise_and_fall(100, n-1);
        System.out.println("总计有"+ (meters_count + first_fall_meters) +"m");
    }
}