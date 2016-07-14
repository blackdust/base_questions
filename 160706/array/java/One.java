public class One{
  public static void main(String args[]){

  int[] array=new int[]{1,2,3};
  reverse(array);
  }

 public static void reverse(int[] ary)
  { 
    for(int j = ary.length - 1; j > -1; j-- )
      System.out.println(ary[j]);
  }
}
