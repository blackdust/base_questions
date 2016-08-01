
public class Two{
    public static void main(String args[]){
        int a = 12345;
        reverse_num_digit(a);
    }

    public static void reverse_num_digit(int a){
        while(a / 10 != 0){
            System.out.println(a % 10);
            a = a/10;
        }
        System.out.println(a % 10);
    }
}