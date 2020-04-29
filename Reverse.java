public class Reverse {
    public static int[] a;
    static int[] reversing()
    {

        int [] arr = {1, 2, 3, 4, 5};
        int i, t;
        int n = arr.length;
        for (i = 0; i < n / 2; i++) {
            t = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = t;
        }
        return arr;
    }

    public static void main(String[] args)
    {
        reversing();
    }
}

