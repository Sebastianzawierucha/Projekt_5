import java.util.Scanner;

public class HalfString {
    public static String word;
    public static int b = 0;
    public static int a;

        public static void main(String[] args) {
            Scanner wprowadzenie = new Scanner(System.in);
            System.out.println("Wprowadź ciąg znaków");
            word = wprowadzenie.next();
            a = word.length();
            half(a);
            String newword = word.substring(0, b);
            System.out.println(newword);
        }
        public static int half(int a) {
            b = a/2;
            return b;
        }

}

