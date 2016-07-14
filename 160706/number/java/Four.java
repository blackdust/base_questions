public class Four{
public static void main(String args[]){

  int a = 113;
  int b = 108;
  loop(a,b);
  }

 public static void loop(int a, int b)
  { 
    if( a == b){
      System.out.println(a);
    }else if(a > b){
      for(int j = b  ;j <= a; j++ )
        System.out.println(j);
    }else{
      for(int j = a ;j <= b; j++ )
        System.out.println(j);
    }
  }
}