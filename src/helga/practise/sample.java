package helga.practise;
import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        int[] ar1=new int[5];
        int k=0;
        Scanner s = new Scanner(System.in);
        for(int x=0;x<ar1.length;x++){
            ar1[x]= k++;
        }

        for(int y:ar1){System.out.print(ar1[y]);}
    }
}
