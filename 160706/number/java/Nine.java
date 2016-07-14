public class Nine{
  public static void main(String args[]){
    int a = 4;
    diamond(a);
    }

  public static void diamond(int a){ 
    String str = "";
    String left_str = "";
    for(int i = 0; i<a; i++){
      str += "x";
    }
    
    for(int i =1; i<=a; i++){
      System.out.println(left_str+str);
      left_str += " ";
    }
  }
}