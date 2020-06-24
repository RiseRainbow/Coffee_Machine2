import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); //recomend
        int b = scanner.nextInt(); //not more
        int h = scanner.nextInt(); //now
        if (h>=a && h <=b) {
            System.out.println("Normal");
        } else if (h>=b){
            System.out.println("Excess");
        } else if (h<=a){
            System.out.println("Deficiency");
        }

    }
}