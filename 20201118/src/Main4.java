import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), m = scn.nextInt();
        int data[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                data[i][j] = scn.nextInt();
            }
        }
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }
}