
public class Four{
    public static void main(String args[]){
        int a = 90;
        int b = 80;
        int c = 50;
        classify_student(a);
        classify_student(b);
        classify_student(c);
    }

    public static void classify_student(int n){
        if(n>=90){System.out.println("a");}else if(n >59 && n < 90){System.out.println("b");}else{System.out.println("c");};
    }
}