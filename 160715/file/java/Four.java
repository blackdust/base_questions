import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;


public class Four{
    public static void main(String args[]){
        newFile("text4",5);
    }

    public static void newFile(String filePathAndName, Integer num) {
        try {
            String filePath = filePathAndName;
            filePath = filePath.toString();
            File myFilePath = new File(filePath);
            if (!myFilePath.exists()) {
                myFilePath.createNewFile();
            }
            FileWriter resultFile = new FileWriter(myFilePath);
            PrintWriter myFile = new PrintWriter(resultFile);
            String strContent = "";
            if (num>1) {
                for (int i = 1; i <= num; i++) {
                    strContent += (Integer.toString(i)+"\n");
                }
            }else{
                for (int i = 1; i >= num; i--) {
                    strContent += (Integer.toString(i)+"\n");
                }
            }
            myFile.println(strContent);
            resultFile.close();

        } catch (Exception e) {
            System.out.println("操作出错");
            e.printStackTrace();
        }
    }
}