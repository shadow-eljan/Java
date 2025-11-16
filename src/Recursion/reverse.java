package Recursion;

public class reverse {

    // Recursive method to reverse a string
    public static String reverseString(String text) {

        // Base condition
        if (text.isEmpty()) {
            return "";
        }

        // Recursive call
        return reverseString(text.substring(1)) + text.charAt(0);

//        reverse("Vibe")

//        step 1
//        reverse("Vibe")
//                = reverse("ibe") + 'V'

        // Step 2
//        reverse("ibe")
//                = reverse("be") + 'i'

        //Step 3
//        reverse("be")
//                = reverse("e") + 'b'

        //Step 4
//        reverse("e")
//                = reverse("") + 'e'

    }

    public static void main(String[] args) {

        String result = reverseString("Vibe");
        System.out.println(result);
    }
}
