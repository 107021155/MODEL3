import java.util.Scanner;

public class Main4 {

    public static void  main(String [] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();
        lcm1(x, y, z);
    }
    public static  void lcm1(int x, int y, int z){
        System.out.println(lcm(lcm(x, y), z));
    }
    public static int lcm(int x, int y) {
        int a = x;
        int b = y;
        if (a<b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        while (a % b > 0) {
            int tmp = a;
            a = b;
            b = tmp%b;
        }
        return (x * y)/b;
    }
}
