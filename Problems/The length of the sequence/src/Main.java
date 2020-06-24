import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        int a;

            a = scanner.nextInt();
         while (a>0) {
             res += 1;
             a = scanner.nextInt();
        };
        System.out.println(res);
    }
}