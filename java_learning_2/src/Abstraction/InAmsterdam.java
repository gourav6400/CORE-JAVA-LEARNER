package Abstraction;



public class InAmsterdam {
    
    private String city;

    public InAmsterdam(String city) {
        this.city = city;
    }

    public int intCountAm(String str) {
        int count = 0;
        String lowerStr = str.toLowerCase();
        String lowerCity = city.toLowerCase();
        int index = lowerStr.indexOf(lowerCity);
        while (index != -1) {
            count++;
            index = lowerStr.indexOf(lowerCity, index + 1);
        }
        return count;
    } 

    public static void main(String[] args) {
        InAmsterdam amsterdam = new InAmsterdam("am I");
        String input = "I Am in AMsterdam am I?";
        int count = amsterdam.intCountAm(input);
        System.out.println(count);
    }
}