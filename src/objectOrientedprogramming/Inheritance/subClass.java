package objectOrientedprogramming.Inheritance;

public class subClass {

    String first;
    String last;

    subClass(String f, String l){
        this.first = f;
        this.last = l;
    }

    void showInfo(){
        System.out.println(this.first + "  " + this.last);
    }
}
