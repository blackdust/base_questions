
public class Seven{
    public static void main(String args[]){
        String str = "ABCDE";
        int num = 2;
        String result = move_to_left(str, num);
    }


    public static String move_to_left(String str, Integer num)
    {
        char [] str_ary = str.toCharArray();

        for(int time = 1; time <= num ;time++){
            char head = str_ary[0];
            for(int i = 0 ; i < str_ary.length-1; i++){
                str_ary[i] =  str_ary[i+1];
            }
            str_ary[str_ary.length-1] = head;
        }
        System.out.println(str_ary);
        return str_ary.toString();
    }  
}