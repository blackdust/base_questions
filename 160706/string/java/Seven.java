import java.util.LinkedList;

public class Seven{
    public static void main(String args[]){
        String str = "ABCDE";
        int num = 2;
        System.out.println(move_to_left(str, num));
    }

    public static String move_to_left(String str, Integer num)
    {
        LinkedList ary = new LinkedList();
        for(int i=0; i <str.length()-1;i++){
            ary.addLast(str.charAt(i));
        }
        for(int x = 1; x<=num; x++){
            String head = (String) ary.pollFirst();
            ary.addLast(head);
        }
        return ary.toString();

    }
}