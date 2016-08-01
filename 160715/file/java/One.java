import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class One{
    public static void main(String args[]){
        newFile("text1","xxxx");
    }
    
    public static void newFile(String filePathAndName, String fileContent) {

        try {
            String filePath = filePathAndName;
            filePath = filePath.toString();
            File myFilePath = new File(filePath);
            if (!myFilePath.exists()) {
                myFilePath.createNewFile();
            }
            FileWriter resultFile = new FileWriter(myFilePath);
            PrintWriter myFile = new PrintWriter(resultFile);
            String strContent = fileContent;
            myFile.println(strContent);
            resultFile.close();

        } catch (Exception e) {
            System.out.println("新建目录操作出错");
            e.printStackTrace();

        }

    }
}