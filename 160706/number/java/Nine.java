import java.util.ArrayList;

public class Nine {
  public static void main(String args[]) {
      int a = 6;
      diamond(a);
  }
  public static void diamond(int a) {
    int line_length = 2 * a - 1;
    ArrayList<String> ary = new ArrayList<String>();
    for (int i = 1; i < a; i++) {
        String blank_str = "";
        String fill_in_str = "";

        for (int x = 0; x < a - i; x++) {
            blank_str += " ";
        }
        for (int y = 1; y <= line_length - 2 * (a - i); y++) {
            fill_in_str = fill_in_str + "x";
        }
        ary.add(blank_str + fill_in_str + blank_str);
    }
    String center_line = "";
    for (int i = 1; i <= a*2-1; i++) {
      center_line += "x";
    }
    ArrayList<String> combine_ary = new ArrayList<String>();

    for (int index1 = 0; index1 < ary.size(); index1++) {
        combine_ary.add(ary.get(index1));
    };
    combine_ary.add(center_line);
    for (int index2 = ary.size() - 1; index2 >= 0; index2--) {
        combine_ary.add(ary.get(index2));
    };

    for (int index = 0; index < combine_ary.size(); index++) {
        System.out.println(combine_ary.get(index));
    };

  }
}
