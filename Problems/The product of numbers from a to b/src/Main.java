import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        int b = scanner.nextInt();

        for ( long i = a + 1; i < b; i++ ){
            a *= i;
        }
        System.out.print(a);

    }
}