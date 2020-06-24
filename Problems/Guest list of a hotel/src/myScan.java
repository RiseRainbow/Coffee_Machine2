import java.util.Scanner;

public class myScan {
    myScan() {
        int a = 0;
    }
    public  String scan() {
        Scanner scanner = new Scanner(System.in);
        String q = "no";
        String check = scanner.next();
        if (check == "" || check == " ") {
            q = check;
        } else {
            q = "not";
        }

        return q;
    };
}
