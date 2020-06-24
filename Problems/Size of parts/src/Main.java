import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 1; i <= num; i++) {
            switch (scanner.nextInt()) {
                case 0:
                    a += 1;
                    break;
                case 1:
                    b += 1;
                    break;
                case -1:
                    c += 1;
                    break;
                default:
                    break;
            }
        }
        System.out.print(a + " " + b + " " + c);
    }
}