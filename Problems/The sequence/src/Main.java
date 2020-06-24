import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int res = 0;
        int a = 0;
        for (int i=1; i<=num; i++){
            a = scanner.nextInt();
            if (res<a && a%4==0){
                res = a;
            }
        }
        System.out.println(res);
    }
}