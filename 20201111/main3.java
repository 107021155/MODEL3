import java.util.Scanner;

public class main3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int count = 0;
        for (int i = 0; i < str.length() / 2; i++) {
            if ((str.substring(i, i + 1)).equals(str.substring(str.length() - 1- i, str.length() - i))) {
                count++;
            }
        }
        if (count == str.length() / 2) {
            System.out.println("是回文字符串");
        }else{
            System.out.println("不是回文字符串");
        }
    }
}
