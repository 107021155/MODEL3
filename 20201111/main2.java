import com.sun.javafx.image.IntPixelGetter;

import java.util.Scanner;

public class main2 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        String str [] = new String[n];
        for (int i=0;i<n;i++){
            str[i] = scn.nextLine();
        }
        for (int j=0;j<n;j++){
            String str1[]=str[j].split(" ");
            int num[] = new int[str1.length];
            for (int k=0;k<str1.length;k++){
                switch (str1[k]. charAt(0)){
                    case 'S':
                        num[k] = 600 + Integer.parseInt(str1[k].substring(1));
                        break;
                    case 'H':
                        num[k] = 200+Integer.parseInt(str1[k].substring(1));
                        break;
                    case 'D':
                        num[k] = 100+Integer.parseInt(str1[k].substring(1));
                        break;
                    case 'C':
                        num[k] = Integer.parseInt(str1[k].substring(1));
                        break;
                }
            }
            for (int k1 = 0; k1 < str1.length ;k1++){
                for (int k2 = 0;k2 < str1.length-1 ;k2++){
                    if (num[k2] < num[k2+1]){
                        int v = num[k2];
                        num[k2]=num[k2+1];
                        num[k2+1]=v;
                        String an = str1[k2];
                        str1[k2] = str1[k2+1];
                        str1[k2+1]=an;
                    }
                }
            }
            for (int b = 0; b < str1.length ;b++){
                System.out.print(str1[b]+" ");
            }
            System.out.println();
        }

    }
}