import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        String str = "NO";
        for (int i=1; i<=m && str == "NO"; i++){
            if (i*n==k){
                str = "YES";
            }
        }
        for (int i=1; i<=n && str == "NO"; i++){
            if (i*m==k){
                str = "YES";
            }
        }
        System.out.println(str);
    }
}