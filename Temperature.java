import java.util.Scanner;

public class Temperature {

public static boolean b;

    public static void main(String[] args) {
        Scanner wprowadzenie = new Scanner(System.in);
        System.out.println("Wprowadź 1 temp");
        int temp1 = wprowadzenie.nextInt();
        System.out.println("Wprowadź 2 temp");
        int temp2 = wprowadzenie.nextInt();
        comparison(temp1, temp2);

    }
    public static boolean comparison(int temp1, int temp2) {
        if(temp1 < 100 || temp2 < 100){
            b = true;
            System.out.println("Jedna z temperatur jest mniejsza od 100");
        }
        else{
            b = false;
            System.out.println("Obie temperatury są większe od 100");
        }
        return b;
    }
}