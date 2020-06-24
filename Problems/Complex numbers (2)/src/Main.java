class Complex {

    double real;
    double image;

    void add (Complex b) {
        this.real+=b.real;
        this.image+=b.image;
    }
    void subtract ( Complex b) {
        this.real-=b.real;
        this.image-=b.image;
    }
}