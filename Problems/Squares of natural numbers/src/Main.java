import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sq = 1;
        int a = 1;
        while (sq <= num) {
            System.out.println(sq);
            a++;
            sq = a*a;
        }
    }
}