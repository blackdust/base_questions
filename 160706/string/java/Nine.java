public class Nine{
    public static void main(String args[]){
        String a = "abc";
        to_asc(a);
    }

    public static void to_asc(String a)
    {
        for(int i =0; i < a.length(); i++ )
            System.out.println((int) a.charAt(i));
    }
}