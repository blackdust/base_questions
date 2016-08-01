public class One{
    public static void main(String args[]){
        int a = 12345;
        find_num_digit(a);
    }

    public static void find_num_digit(int a){
        int time = 0;
        while(a / 10 != 0){
            a = a/10;
            time++;
        }
        System.out.println(time+1);
    }
}