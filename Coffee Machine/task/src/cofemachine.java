import java.util.Scanner;

public class cofemachine {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Write how many cups of coffee you will need:");
        int a = scanner.nextInt();
        int water = 200;
        int milk = 50;
        int beans = 15;
        System.out.println("For "+ a +" cups of coffee you will need:");
        System.out.println(water*a + " ml of water");
        System.out.println(milk*a + " ml of milk");
        System.out.println(beans*a + " g of coffee beans");

    }

}
