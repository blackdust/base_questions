
public class Eight{
    public static void main(String args[]){
        String str = "ABCDE";
        int num = 2;
        String result = move_to_right(str, num);
    }


    public static String move_to_right(String str, Integer num)
    {
        char [] str_ary = str.toCharArray();

        for(int time = 1; time <= num ;time++){
            char end = str_ary[str_ary.length-1];
            for(int i = str_ary.length-1 ; i >0; i--){
                str_ary[i] =  str_ary[i-1];
            }
            str_ary[0] = end;
        }
        System.out.println(str_ary);
        return str_ary.toString();
    }  
}