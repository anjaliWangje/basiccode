public class swapping {
    public static void main(String[] args){
        String str = " hello";
        String str1=" java";
        System.out.println(" before swapping");
        System.out.println(" str;"+ str);
        System.out.println(" str1;"+ str1);
        String temp;
        temp=str;
        str=str1;
        str1=temp;
        System.out.println(" after swapping");
        System.out.println(" str;" +str);
        System.out.println(" str1;"+str1);
    }
}
class pranali{
    public static void main(String[] args) {
        int num = 10;
        int nuum=20;
        System.out.println(" before swapping ");
        System.out.println(" after swapping");
        int temp;
        temp=num;
        num=nuum;
        nuum=temp;
        System.out.println(" num:"+num);
        System.out.println("numm:"+nuum);
    }
}
