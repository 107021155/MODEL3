import java.math.BigDecimal;
import java.util.Scanner;

public class main1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double n = scn.nextDouble();
        int m = scn.nextInt();
        BigDecimal bd = new BigDecimal(n);
        bd = bd.setScale(m,BigDecimal.ROUND_HALF_UP);
        System.out.println(bd);
    }
}