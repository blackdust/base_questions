public class Ten{
  public static void main(String args[]){
    int a = 4;
    int b = 6;
    Trapezoid(a,b);
    }

  public static void Trapezoid(int a,int b){
    int max, min;
    if(a > b){
       max = a;
       min = b;
    }else{
       max = b;
       min = a;
    }

    String str = "";
    for(int i = 1; i <= min; i++)
      str += "x";
    
    for(int y = min; y <= max; y++){
      System.out.println(str);
      str += "x";
    }
  }
}