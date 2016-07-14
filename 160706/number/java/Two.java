public class Two{
public static void main(String args[]){

  int a = 103;
  loop(a);
  }

 public static void loop(int a)
  { 
    if( a == 100){
      System.out.println(100);
    }else if(a > 100){
      for(int j = 100  ;j <= a; j++ )
        System.out.println(j);
    }else{
      for(int j = 100 ;j >= a; j-- )
        System.out.println(j);
    }
  }
}
















