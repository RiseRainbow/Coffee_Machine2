class Car {

    int yearModel;
    String make;
    int speed;
    void brake() {
        if (speed != 0 && speed >= 5){
        speed-=5;}
    }
    void accelerate(){
        speed+=5;
    }
}