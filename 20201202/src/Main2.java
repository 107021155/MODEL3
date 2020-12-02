import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        char c=scn.next().charAt(0);
        square(n,c);

    }
    public static  void square(int n,char c){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}