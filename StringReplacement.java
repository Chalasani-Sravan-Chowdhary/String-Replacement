import java.util.Scanner;

public class StringReplacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();

        System.out.print("Enter the substring to be replaced: ");
        String substringToReplace = scanner.nextLine();
        System.out.print("Enter the new substring to replace the other: ");
        String newSubstring = scanner.nextLine();
        String modifiedString = originalString.replace(substringToReplace, newSubstring);
        System.out.println("Modified string: " + modifiedString);

        scanner.close();
    }
}