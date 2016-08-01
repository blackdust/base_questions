import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

public class Nine{
    public static void main(String args[]){
        callShell("../java/One.java");
    }

    public static void callShell(String path) {
        List<String> strList = new ArrayList();
        try {
            String shellString = "pwd "+path;
            Process process = Runtime.getRuntime().exec(shellString);
            InputStreamReader ir = new InputStreamReader(process
                    .getInputStream());
            LineNumberReader input = new LineNumberReader(ir);
            String line;
            int exitValue = process.waitFor();
            if (0 != exitValue) {
                System.out.println("运行出错" + exitValue );
            }else{
                while ((line = input.readLine()) != null){
                    System.out.println(line);
                    strList.add(line);
                }
            }
        } catch (Throwable e) {
            System.out.println("运行出错" + e );
        }
    }
}