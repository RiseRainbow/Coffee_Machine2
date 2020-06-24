import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1;
        String str2;
        str1 = scanner.nextLine().replace(" ", "");
        str2 = scanner.nextLine().replace(" ", "");
        System.out.println(str2.equals(str1));
    }
}