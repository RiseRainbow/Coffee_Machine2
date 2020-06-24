import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 1; i <= num; i++) {
            switch (scanner.nextInt()) {
                case 2:
                    d += 1;
                    break;
                case 3:
                    c += 1;
                    break;
                case 4:
                    b += 1;
                    break;
                case 5:
                    a += 1;
                    break;
                default:
                    break;
            }
        }
        System.out.print(d + " " + c + " " + b + " " + a);
    }
}