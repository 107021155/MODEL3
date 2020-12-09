import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        fun(scn.next());
    }
    public static void fun(String str){
        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
}
