public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0;
        int i = 1;
        while (i < 11) {
            System.out.print(x + " ");
            x = x + i;
            i = i + 1;
        }
    }
}
