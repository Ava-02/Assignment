import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.trim().toLowerCase();
        str2 = str2.trim().toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        System.out.println(areAnagrams(str1, str2) ? "Yes, they're anagrams!" : "No, not anagrams.");

        scanner.close();
    }
}
