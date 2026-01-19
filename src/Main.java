public class Main {

    public static void main(String[] args) {

        // Safe division
        int a = 100;
        int b = 10; // Changed from 0 to 10
        int result = a / b;
        System.out.println("Division result: " + result);

        // Safe string handling
        String input = "Hello World";
        if (input != null) {
            System.out.println("Input length: " + input.length());
        } else {
            System.out.println("Input is null");
        }

        // Proper string comparison
        String userRole = "ADMIN";
        if ("ADMIN".equals(userRole)) {
            System.out.println("Admin access granted");
        }

        // Safe printUser call
        printUser("JohnDoe"); // Passing non-null value

        // Password check
        boolean login = insecurePasswordCheck("admin", "password123");
        if (login) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }

    public static void printUser(String user) {
        if (user != null) {
            System.out.println("User: " + user.toLowerCase());
        } else {
            System.out.println("User is null");
        }
    }

    public static boolean insecurePasswordCheck(String username, String password) {
        // Insecure, but ok for testing
        return "admin".equals(username) && "password123".equals(password);
    }
}
