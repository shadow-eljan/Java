package objectOrientedprogramming.Composition;

public class Engine {

    String enginetype;

    Engine(String type){
        this.enginetype = type;
    }

    void start(){
        System.out.println("Engine started.");
    }
}
