package array;

public class commonelement {
    public static void main(String[] args) {
        int[]aray1={1,5,7,9,10};
        int[]array2={1,6,5,9,45};
        int i,j;
        for( i=0;i< aray1.length;i++){
            for(j=0;j< array2.length;j++){
                if(aray1[i]==array2[j]){
                    System.out.println(aray1[i]);
                }
            }

        }

    }
}
