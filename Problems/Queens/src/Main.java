import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if ((a==c || b==d) || ((Math.abs((d-b)%(c-a))==0)&&(Math.abs((d-b)/(c-a))==1))){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}