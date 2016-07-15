import java.util.ArrayList;

public class Seven{
    public static void main(String args[]){
        int a = 10;
        decompose(a);
    }

    public static ArrayList find_prime_num(int a){
        ArrayList array = new ArrayList();
        ArrayList prime = new ArrayList();
        ArrayList unprime = new ArrayList();
        for(int i = 2; i<= a; i++){
            int k = 0;
            for(int num = 2; num<= i; num++){
                if(i%num == 0){k++;}
            }
            if(k != 1){ unprime.add(i);}else{prime.add(i);};
        }
        array.add(prime);
        array.add(unprime);
        return array;
    }

    public static ArrayList make_coupes_deal_other_number(int may_deal_num, ArrayList result_ary, ArrayList prime_arys){
        for(int i = 0; i < prime_arys.size(); i++){
            int prime_num = (int) prime_arys.get(i);
            if(may_deal_num % prime_num == 0){
                ArrayList item = new ArrayList();
                item.add(prime_num);
                item.add( may_deal_num / prime_num);
                result_ary.add(item);
                if(may_deal_num / prime_num != 1){
                    make_coupes_deal_other_number(may_deal_num / prime_num, result_ary, prime_arys);
                }
            }
        }
        return result_ary;
    }

    public static void print(int num, ArrayList ary){
        ArrayList pick = new ArrayList();
        for(int f = 0; f < ary.size(); f++){
            ArrayList item = (ArrayList) ary.get(f);
            pick.add((int) item.get(0));
            if((int) item.get(1) == 1){
                break;
            }
        }  
        System.out.println(num + "分解后：");
        String str = pick.toString();
        str = str.substring(1,str.length()-1);
        str = str.replaceAll(",","x");
        System.out.println(str.replaceAll(" ",""));
    }

    public static void decompose(int a){
        ArrayList prime  = (ArrayList) find_prime_num(a).get(0);
        ArrayList unprime  = (ArrayList) find_prime_num(a).get(1);
        ArrayList array=new ArrayList<Integer> (){{add(1); add(1);}};
        System.out.println( 1 + "分解后：");
        System.out.println("1x1");
        for(int i = 0; i < unprime.size(); i++){
            int num = (int) unprime.get(i);
            ArrayList result_ary =  new ArrayList();
            result_ary = make_coupes_deal_other_number(num, result_ary, prime);
            ArrayList resault_ary_pick = new ArrayList();
            for(int m = 0; m< result_ary.size(); m++){
                resault_ary_pick.add(result_ary.get(m));
            }
            print(num, resault_ary_pick);
        }
    }
}