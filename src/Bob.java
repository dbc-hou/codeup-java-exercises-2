import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Talk to Bob:");
        String stringInput = sc.nextLine();
        do {
            if (stringInput.equalsIgnoreCase("exit")) {
                return;
            }
            System.out.print("Talk to Bob: ");
            if (stringInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (stringInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (stringInput.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
        } while (!(stringInput.equalsIgnoreCase("exit")));
    }
}
