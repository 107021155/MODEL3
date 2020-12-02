import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        long seed=scn.nextLong();
        Random rnd=new Random();
        rnd.setSeed(seed);
        int newdata[][]=new int[10][10];


        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++) {
                newdata[i][j]=rnd.nextInt(10);
            }
        }


        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++) {
                System.out.print(newdata[j][i] + "\t");
            }System.out.println();
        }


    }
}