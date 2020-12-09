import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        int count = 0;
        time(n,count);

        System.out.println(time(n,count));
    }
    public static int time(long n,int count){

        if(n/10>=1){
            n/=10;
            count++;
            return time(n,count);
        }

        else {
            return count+1;
        }

    }
}