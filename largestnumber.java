package array;

public class largestnumber {
     static int [] array={10,208,87,90,209,765,876,};
    static int largest() {
        int i;
        int max = array[0];
        for(i =1 ; i<array.length; i++);
            if(array[i]>max)
                max =array[i];
            return max;
    }

    public static void main(String[] args) {
        System.out.println("Largest in given array is " + largest());

    }
}
