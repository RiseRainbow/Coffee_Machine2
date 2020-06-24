import java.util.Scanner;

public class coffeeProject {
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        {  int a=0;
            /*do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            a = bft(scanner.nextLine()); }*/
            while (a==0){
                System.out.println(" ");
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            a = bft(scanner.nextLine()); }
        }
    }

    static int bft(String str){  // ВЫБОР ЧТО ДЕЛАЕМ
        int res=0;
        switch (str) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                buy_coffee(scanner.nextLine());
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            case "remaining":
                current_condition();
                break;
            case "exit":
                res=1;
                break;
            default:
                break;
        }
        return res;
    }

    static int buy_coffee(String i){  // ПОКУПАЕМ КОФЕ
        int res=0;
        switch (i) {
            case "1": //espresso
                if (current_condition(250,0,16)=="good"){
                    water-=250;
                    beans-=16;
                    cups-=1;
                    money+=4;
                    System.out.println("I have enough resources, making you a coffee!");
                    //current_condition();
                }
                break;
            case "2": // latte
                if (current_condition(350,75,20)=="good"){
                    water-=350;
                    milk-=75;
                    beans-=20;
                    cups-=1;
                    money+=7;
                    System.out.println("I have enough resources, making you a coffee!");
                    //current_condition();
                }
                break;
            case "3": // cappuccino
                if (current_condition(200,100,12)=="good"){
                    water-=200;
                    milk-=100;
                    beans-=12;
                    cups-=1;
                    money+=6;
                    System.out.println("I have enough resources, making you a coffee!");
                    //current_condition();
                }
                break;
            case "back":
                break;
            default:
                res=0;
                break;
        }
        return res;
    }



    static void fill(){  // Заправляем товаром
        System.out.println("Write how many ml of water do you want to add:");
        water+=scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milk+=scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        beans+=scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        cups+=scanner.nextInt();
        //current_condition();
    }

    static void take(){  // СНИМАЕМ НАЛИК
        System.out.println("I gave you $"+money);
        money-=money;
        //current_condition();
    }

    static String current_condition(int water_ch, int milk_ch, int beans_ch) {  // ЧЕК НА НАЛИЧИЕ
        String str="good";
        if (water<water_ch){
            str="water";
            System.out.println("Sorry, not enough water!");
        } else if (milk<milk_ch) {
            str="milk";
            System.out.println("Sorry, not enough milk!");
        } else if (beans<beans_ch) {
            str="beans";
            System.out.println("Sorry, not enough beans!");
        } else if (cups<1) {
            str="cups";
            System.out.println("Sorry, not enough cups!");
        }
        return str;
    }

    static void current_condition (){  // ВЫВОД ТЕКУЩЕГО СОСТОЯНИЯ
        System.out.println("The coffee machine has:");
        System.out.println(water+" of water");
        System.out.println(milk+" of milk");
        System.out.println(beans+" of coffee beans");
        System.out.println(cups+" of disposable cups");
        System.out.println(money+" of money");
    }
}
