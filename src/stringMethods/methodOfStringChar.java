package stringMethods;

public class methodOfStringChar {
    public static void main(String[] args) {

        String name = "Eljan Rai";
        String test ="  ";
        String test2 = "Password";
        int length = name.length();
        char letter = name.charAt(6);
        int index = name.indexOf("a");
        int lastindex = name.lastIndexOf("i");

//        name = name.toUpperCase();
//        name = name.toLowerCase();
//        name = name.trim();
//        name = name.replace("a", "o");

        System.out.println(name);
        System.out.println(letter);
        System.out.println(length);
        System.out.println(index);
        System.out.println(lastindex);
        System.out.println(name.isEmpty());
        System.out.println(test.isBlank());

        if(test.contains(" ")){
            System.out.println("It contains a.");
        }else{
            System.out.println("It doesn't contain a.");
        }

        if(name.isEmpty()){
            System.out.println("EMPTY");
        }else{
            System.out.println("NOT EMPTY");
        }
        if(test2.equalsIgnoreCase("password")){
            System.out.println("Password cannot be " + test2 );
        }else{
            System.out.println("Hello " + test2);
        }
    }
}
