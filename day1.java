
import java.util.Scanner;
public class day1 { 
    public static void main(String[] args){
        Scanner obj=new Scanner (System.in);
        int n=obj.nextInt();
        for (int idx = 0; idx < n; idx++) {
           for(int j=0;j<idx;j++){
            System.out.println("*");
           }
            System.out.println();

        }
    }
    }