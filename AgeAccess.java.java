import java.util.Scanner;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class AgeAccess {
    public static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Access denied");
        } else {
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        try {
            checkAge(age);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}