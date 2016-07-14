public class Six{
  public static void main(String args[]){
    int a = 10;
    find_prime_num(a);
    }

  public static void find_prime_num(int a){ 
    for(int i = 2; i<= a; i++){
      int k = 0;
      for(int num = 2; num<= i; num++){
        if(i%num == 0){k++;}
      }
      if(k != 1){ System.out.println(i);}
    }
  }
}