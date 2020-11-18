import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str =scn.nextLine();
        int n=str.split(" ").length,m=0;
        System.out.println(n);
        int data1[]=new int[26];
        int data2[]=new int[26];
        for (int i=0;i<str.length();i++){
            m=str.charAt(i)-'a';
            if (m>=0&&m<26){
                data1[m]++;
            }else{
                m=str.charAt(i)-'A';
                if (m>=0&&m<26){
                    data2[m]++;
                }
            }
        }
        for (int i=0;i<26;i++){
            if (data1[i]>0){
                int x=(int)'a'+i;
                System.out.println((char)x+":"+data1[i]);
            }
        }
        for (int i=0;i<26;i++){
            if (data2[i]>0){
                int x=(int)'A'+i;
                System.out.println((char)x+":"+data2[i]);
            }
        }
    }
}