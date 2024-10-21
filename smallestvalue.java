package array;

public class smallestvalue {
    public static void main(String[] args) {
        int array[]={10,30,60,89,5};
        int small=array[0];
        for(int i=0; i<array.length; i++){
            if(small>array[i]){
                small=array[i];
            }
        }
        System.out.println(" this is small:"+small);
    }

}
 class akshra{
     public static void main(String[] args) {
         int arrayy[]={ 10,90,70,67,89};
         int sum=0;
         for( int i =0;i <arrayy.length; i++){
             if(sum>arrayy[i]) {
                 sum=arrayy[i];
             }
         }
         System.out.println(" this is maximum:"+sum);
     }
 }