import java.util.*;
public class Way_too_long_words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            if (word.length() > 10) {
                String abbreviated = word.charAt(0) + Integer.toString(word.length() - 2) + word.charAt(word.length() - 1);
                System.out.println(abbreviated);
            } else {
                System.out.println(word);
            }
        }
        scanner.close();
    }
}
    