public class Five {
    public static void main(String args[]){
        int[] array = new int[]{1,3,2,4,9,5,6,7,8};
        do_sort(array);
    }
    public static void do_sort(int[] a){
      int temp=0;  
      for(int i=0;i<a.length-1;i++){  
        for(int j=0;j<a.length-1-i;j++){  
            if(a[j]>a[j+1]){  
              temp=a[j];  
              a[j]=a[j+1];  
              a[j+1]=temp;  
            }  
        }  
      }  
      for(int i=0;i<a.length;i++)  
        System.out.println(a[i]);     
    }
}