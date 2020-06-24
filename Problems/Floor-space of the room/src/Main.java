import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        double a;
        double b;
        double c;
        int r;
        double p = 3.14;
        switch (str) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                System.out.println(triangleS(a,b,c));
                break;
            case "rectangle":
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println(a * b);
                break;
            case "circle":
                r = scanner.nextInt();
                System.out.println(p * r * r);
                break;
            default:
                System.out.println("error!");

        }
    }
    static Double triangleS (Double a, Double b, Double c){
        Double p = (a+b+c)/2;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return S;
    }
}
