import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        System.out.print("Please enter your input: ");

        Scanner scan = new Scanner(System.in);

        String words = scan.nextLine();

        int countWords = words.split("\\s").length;

        System.out.println(countWords);
    }
}
