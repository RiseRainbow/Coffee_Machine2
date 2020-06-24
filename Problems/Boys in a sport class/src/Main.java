import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(checkHeight(a,b,c));
    }


    static boolean checkHeight(int a, int b, int c){
        boolean res = false;
        if ( (a > b || a == b) && (b > c || b == c)){
            res = true;
        } else if ((a < b || a == b) && (b < c || b == c))
        {
            res = true;
        }
        return res;
    }
}