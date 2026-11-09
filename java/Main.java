public class Main {
    public static void main(String[] args) {
        char z = '*';
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(z);
            }
            System.out.println();
        }
    }
}