import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        ArrayList <Integer> a = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int b;
        do {
             b = scanner.nextInt();
             if (b!=0){
                 a.add(b);
             }
        }
        while (b != 0);
        for (int i=0; i<a.size(); i++){
            if (a.get(i)%2==0){
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}