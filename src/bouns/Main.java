package bouns;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String validUsername = "wahab";
        String validPassword = "wahab";
        int numberOfTries = 3;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= numberOfTries; i++) {
            try {
                System.out.println("Enter your username: ");
                String username = scanner.nextLine();
                System.out.println("Enter your password: ");
                String password = scanner.nextLine();

                if (username.equals(validUsername) && password.equals(validPassword)) {
                    System.out.println("You have logged in!");
                    break;
                } else {
                    if (i == numberOfTries) {
                        System.out.println("You have exceeded the try limit!");
                    } else {
                        throw new Exception("Invalid credentials");
                    }
                }

            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
