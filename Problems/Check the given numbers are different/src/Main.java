import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (i != b && i != c && b != c) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}