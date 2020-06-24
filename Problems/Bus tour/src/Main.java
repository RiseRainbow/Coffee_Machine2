import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int size = scanner.nextInt();
        int height_now = 0;
        ArrayList<Integer> a = new ArrayList<>();
        for (int i=1; i<=size; i++){
            if (scanner.nextInt() <= height){
                height_now = i;
                break;
            }
        }
        if (height_now == 0) {
            System.out.print("Will not crash");
        } else {
            System.out.print("Will crash on bridge "+height_now);
        }
    }
}
