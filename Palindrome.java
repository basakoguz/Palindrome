import java.util.Scanner;

public class Palindrome {
    String word;
    Scanner scanner = new Scanner(System.in);

    public Palindrome(){
        word = scanner.nextLine();
        word = word.toLowerCase();
        scanner.close();
    }

    public static boolean isPalindrome(String word) {
        char[] ary = new char[word.length()];
        for (int i = 0; i<word.length(); i++){
            ary[i] = word.charAt(word.length()-i-1);
        }
        String reverse = new String(ary);
        System.out.println("Typed in: " + word);
        System.out.println("Reverse is: " + reverse);
        if(word.equals(reverse)){
            System.out.println("Yes it is a palindrome.");
            return true;
        } else{
            System.out.println("No it is not a palindrome.");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Type in the word to check if it is palindrome: ");
        Palindrome palindrome = new Palindrome();
        if(palindrome.word.equals(" ")){
          System.out.println("You did not type any word!");
        } else{
        System.out.println(isPalindrome(palindrome.word));
        }
    }
}
