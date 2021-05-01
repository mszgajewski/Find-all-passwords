import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        boolean matchFound = false;

        Pattern pattern = Pattern.compile("password[\\s:]*(\\w+)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text.strip().trim());
        matcher = matcher.reset();


        while (matcher.find()) {
            System.out.println(matcher.group(1));
            matchFound = true;
        }

        if (!matchFound) {
            System.out.println("No passwords found.");
        }
    }
}
