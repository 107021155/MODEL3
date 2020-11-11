import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int data[] = new int[3];
        for (int i=0; i<3 ;i++){
            data[i] = scn.nextInt();

        }
        int maxval=0;
        int minval=0;
        for (int j=0;j<1;j++){
            maxval=data[j];
            minval=data[j];
        }
        for (int i=1;i<data.length;i++){
            if (data[i]>maxval){
                maxval=data[i];
            }else if(data[i]<minval){

                minval=data[i];
            }
        }
        System.out.println(maxval);
        System.out.println(minval);

    }
}