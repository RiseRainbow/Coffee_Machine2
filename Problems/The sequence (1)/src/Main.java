import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        for (int i=1; i<=num; i++) {
            for (int k=1; k<=i; k++) {


                if (count==num){
                    break;
                }
                System.out.print(i+" ");
                count++;
            }
            if (count==num){
                break;
            }
        }
    }
}