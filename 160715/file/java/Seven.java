import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Seven{
    public static void main(String args[]) throws IOException {
        join_file("j1","j2");
    }
    public static void join_file(String a ,String b) throws IOException {
        String content_a =  read_file(a, "");
        String content_a_plus_b = read_file(b,content_a);
        FileWriter resultFile = new FileWriter("fout");
        PrintWriter myFile = new PrintWriter(resultFile);
        myFile.println(content_a_plus_b);
        resultFile.close();
    }
    public static String read_file(String fileName ,String string) {
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            String str = string;
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            while ((tempString = reader.readLine()) != null) {
                str += tempString+"\n";
                line++;
            }
            reader.close();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        return fileName;
    }
}