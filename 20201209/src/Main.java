import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt(), m=scn.nextInt();
        System.out.println(fun(n)/(fun(m)*fun(n-m)));
    }
    public static int fun(int x){
        int sum=1;
        for (int i=1;i<=x;i++){
            sum*=i;
        }
        return sum;
    }
}