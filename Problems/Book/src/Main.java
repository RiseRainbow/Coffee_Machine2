import java.lang.reflect.Array;
import java.util.Arrays;

class Book {
    String title;
    int yearOfPublishing;
    //public Arrays authors;
    String[] authors;

    public Book(String a, int b, String[] c){
        this.title = a;
        this.yearOfPublishing = b;
        this.authors = c;
    }

}