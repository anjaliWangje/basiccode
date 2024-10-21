package stringmethhod;

public class reverse {
    public static void main(String[] args) {
        String s = "anjali";
        String revres= " ";
        char[] charArray=s.toCharArray();
        int lenghr=s.length();
        for(int i= charArray.length-1;i>=0;i--){
            revres+=charArray[i];
        }
        System.out.println( revres);


    }
}
class aboliii{
    public static void main(String[] args) {
        String aa= "abolii";
        String reversed=" ";
        char[]chararray=aa.toCharArray();
        int lenght=aa.length();

        for(int i=chararray.length-1;i>=0;i--){
            reversed+=chararray[i];


        }
        System.out.println(reversed);
    }

}