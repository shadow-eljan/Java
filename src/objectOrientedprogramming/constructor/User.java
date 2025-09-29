package objectOrientedprogramming.constructor;

public class User {
    String username;
    String email;
    int age;

    User(){
        this.username = "Guest";
        this.age= 0;
        this.email = "not provided";
    }

    User(String name){
        this.username = name;
        this.age= 0;
        this.email = "not provided";
    }
    User(String name, String email){
        this.username = name;
        this.age= 0;
        this.email = email;
    }
    User(String name, String email, int age){
        this.username = name;
        this.age= age;
        this.email = email;
    }

    void showInfo(){
        System.out.println(username);
        System.out.println(email);
        System.out.println(age);
    }

}
