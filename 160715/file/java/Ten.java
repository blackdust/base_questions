import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Ten{
    public static void main(String args[]){
       del_file("text10");
    }

    public static void del_file(String filePathAndName) {  
        System.out.println("等待5秒后删除");
        try
        {
            Thread.currentThread().sleep(5000);
        }
        catch(Exception e){}

        try {
            String filePath = filePathAndName;
            filePath = filePath.toString();
            java.io.File myDelFile = new java.io.File(filePath);
            myDelFile.delete();

        } catch (Exception e) {
            System.out.println("删除文件操作出错");
            e.printStackTrace();
        }
        System.out.println("已删除");
    }
}