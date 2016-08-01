import java.io.File;

public class Eight{
    public static void main(String args[]){
        check_floder("../java");
        check_floder("../xxx");
    }

    public static void check_floder(String folderPath) {
        try {
            String filePath = folderPath;
            filePath = filePath.toString();
            java.io.File myFilePath = new java.io.File(filePath);
            if (myFilePath.exists()) {
                System.out.println("目录对的");
            }else {
                System.out.println("目录错的");
            }
        } catch (Exception e) {
            System.out.println("操作出错");
            e.printStackTrace();
        }
    }
}