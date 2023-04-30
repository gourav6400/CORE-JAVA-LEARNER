package Abstraction;
public class demo2 {
    
    // Method to insert a space between each character of a given string
    public static String insertSpace(String s) {
        return s.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .reduce((s1, s2) -> s1 + " " + s2)
                .orElse("");
    }

    public static void main(String[] args) {
        String input = "hello";
        String formatted = insertSpace(input);
        System.out.println(formatted); // Output: h e l l o
    }
}