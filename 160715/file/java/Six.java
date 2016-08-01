import java.io.File;

public class Six{
    public static void main(String args[]){
        count_size("text1");
        count_size("text1111");
    }

    public static void count_size(String path) {
        File f= new File(path);
        if (f.exists() && f.isFile()){
            long size = f.length();
            System.out.println(size);
        }else{
            System.out.println("null");
        }
    }
}