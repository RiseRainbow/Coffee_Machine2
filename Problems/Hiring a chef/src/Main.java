//put imports you need here
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String age = scan.nextLine();
        String work_age = scan.nextLine();
        String education = scan.nextLine();
        String cuisine = scan.nextLine();
        System.out.println("The form for "+ name +" is completed. We will contact you if we need a chef that cooks "+cuisine+" dishes.");
    }
}