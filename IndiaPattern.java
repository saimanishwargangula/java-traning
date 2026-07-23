public class IndiaPattern {
    public static void main(String[] args) {
        String str = "INDIA";
        
        // Loop to print the string building character by character
        for (int i = 1; i <= str.length(); i++) {
            System.out.println(str.substring(0, i));
        }
    }
}