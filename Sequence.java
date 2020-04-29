import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BooleanSupplier;

public class Sequence {
    public static int tab[];
    public static boolean b;
    public static int c;
    public static void main(String args[]) {
        tab = new int[]{1,2,3,2,3,4,5,6,7,8,9};
        sekwencja(tab);

    }

    public static boolean sekwencja(int tab[]){
        int j = tab.length;
        for(int i=0; i<j-2; i++ ){
            if(tab[i]==1 && tab[i+1]==2 && tab[i+2]==3){
            c++;
            }

        }
    if(c>0){
        b = true;
    }
    else{
        b = false;
    }
    System.out.print(b);
        return b;

    }


}