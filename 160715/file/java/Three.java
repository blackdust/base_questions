
public class Three{
    public static void main(String args[]){
        check_file_exist("text1");
        check_file_exist("text1xx");
    }
    public static void check_file_exist(String folderPath) {
        try {
            String filePath = folderPath;
            filePath = filePath.toString();
            java.io.File myFilePath = new java.io.File(filePath);
            if (!myFilePath.exists()) {
                System.out.println("不存在");
            }else{System.out.println("存在");};
        } catch (Exception e) {
            System.out.println("操作出错");
            e.printStackTrace();
        }
    }
}