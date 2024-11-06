import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String validUsername = "Coded";
        String validPassword = "Coded123";
        boolean notLoggedIn = true;

        Scanner scanner = new Scanner(System.in);

        while (notLoggedIn) {
            try {
                System.out.println("Enter your username: ");
                String username = scanner.nextLine();
                System.out.println("Enter your password: ");
                String password = scanner.nextLine();

                if (username.equals(validUsername) && validPassword.equals(password)) {
                    System.out.println("You have logged in!");

                    notLoggedIn = false;
                    break;
                } else {
                    throw new Exception("Invalid credentials");
                }


            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        scanner.close();
    }
}