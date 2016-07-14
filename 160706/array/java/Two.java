import java.util.ArrayList;
public class Two{
    public static void main(String args[]){

        ArrayList array = new ArrayList();
        array.add(1);
        array.add(2);
        ArrayList array1 = new ArrayList();
        array1.add(3);
        array1.add(4);
        ArrayList array2 = new ArrayList();
        array2.add(5);
        array2.add(6);

        array1.add(array2);
        array.add(array1);

        ArrayList result_list = new ArrayList();
        ArrayList flatten_result = new ArrayList();
        flatten_result = flatten(array, result_list);
        System.out.println(flatten_result);

    }
    public static ArrayList flatten(ArrayList ary, ArrayList result_list)
    {
        for(int j = 0; j < ary.size(); j++ )
            if(ary.get(j) instanceof ArrayList){
                flatten((ArrayList) ary.get(j), result_list);
            }else{
                result_list.add(ary.get(j));
            }
        return result_list;
    }
}
