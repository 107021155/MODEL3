import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        fun(scn.nextInt(),scn.nextInt());
    }
    public static void fun(int w,int h){
        for (int i=1;i<=h;i++){
            for (int j=1;j<=w;j++){
                System.out.print((i*j)+"\t");
            }
            System.out.println();
        }
    }
}