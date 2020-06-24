class Cat {

    // write static and instance variables
    String name;
    int age;
    static int counter = 0;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
    }

    public static int getNumberOfCats() {
        if (counter>5) {
            for (int i=1; i<=counter-5; i++){
            System.out.println("You have too many cats");}
        }
        return  counter;
    }
}