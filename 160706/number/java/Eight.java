public class Eight{
  public static void main(String args[]){
    int a = 4;
    rect(a);
    }

  public static void rect(int a){ 
    String str = "";
    for(int i = 0; i<= a; i++){
      str += "x";
    }
    for(int x = 0; x<= a; x++)
       System.out.println(str);

  }
}