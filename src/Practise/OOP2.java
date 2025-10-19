package Practise;

public class OOP2 extends OOP1{
    @Override
    void speak(){
        System.out.println("I override this.");
    }

    String oopType;

    OOP2(String type){
        this.oopType= type;
    }
    void display(){
        System.out.println(this.oopType);
    }
}
