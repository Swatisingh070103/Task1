public class Main {

    public static void main(String[] args) {
        // Orchestrator: main only calls other methods
        int divisionResult = divide(100, 10);
        System.out.println("Division result: " + divisionResult);

        printInputLength("Hello World");
        checkAdminAccess("ADMIN");

        printUser("JohnDoe");

        boolean login = insecurePasswordCheck("admin", "password123");
        printLoginStatus(login);
    }

    // Refactored method for division
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    // Refactored method to print input length safely
    public static void printInputLength(String input) {
        if (input != null) {
            System.out.println("Input length: " + input.length());
        } else {
            System.out.println("Input is null");
        }
    }

    // Refactored method to check admin role
    public static void checkAdminAccess(String role) {
        if ("ADMIN".equals(role)) {
            System.out.println("Admin access granted");
        }
    }

    // Existing printUser method is fine
    public static void printUser(String user) {
        if (user != null) {
            System.out.println("User: " + user.toLowerCase());
        } else {
            System.out.println("User is null");
        }
    }

    // Existing insecurePasswordCheck method is fine
    public static boolean insecurePasswordCheck(String username, String password) {
        return "admin".equals(username) && "password123".equals(password);
    }

    // Refactored method to print login status
    public static void printLoginStatus(boolean login) {
        if (login) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }
}
