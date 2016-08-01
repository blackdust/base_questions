import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Five{
    public static void main(String args[]){
        new_and_del_file("text1");
    }

    public static void new_and_del_file(String filePathAndName) {
        try {
            String filePath = filePathAndName;
            filePath = filePath.toString();
            File myFilePath = new File(filePath);
            if (!myFilePath.exists()) {
                myFilePath.createNewFile();
            }
            FileWriter resultFile = new FileWriter(myFilePath);
            PrintWriter myFile = new PrintWriter(resultFile);
            resultFile.close();
        } catch (Exception e) {
            System.out.println("新建目录操作出错");
            e.printStackTrace();
        }
        System.out.println("新建成功 5秒后删除");
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