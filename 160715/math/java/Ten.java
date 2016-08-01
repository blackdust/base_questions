
public class Ten{
    public static void main(String args[]){
        int a = 10;
        count_zero_form_fact(a);
    }

    public static void count_zero_form_fact(int a){
        int count = a;
        for(int i = count-1 ; i>0 ; i--){
            count = count*i;
        }
        String result = String.valueOf( count);
        char[] strChar = result.toCharArray();
        char[] zero = "0".toCharArray();
        int zero_count = 0;
        for(int m = strChar.length-1; m >=0; m--) {
            if (zero[0] == strChar[m]) {zero_count++;}else{break;};
        }
        System.out.println(zero_count);

    }
}