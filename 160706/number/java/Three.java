

public class Three{
public static void main(String args[]){

  int a = 113;
  int b = 108;
  loop(a,b);
  loop(b,a);
  }

 public static void loop(int a, int b)
  { 
    if( a == b){
      System.out.println(a);
    }else if(a > b){
      for(int j = a  ;j >= b; j-- )
        System.out.println(j);
    }else{
      for(int j = a ;j <= b; j++ )
        System.out.println(j);
    }
  }
}