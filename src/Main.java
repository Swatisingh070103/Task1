public class Main {

    public static void main(String[] args) {

        // --- Safe division ---
        int a = 100;
        int b = 10; // Changed from 0 to 10
        int result = a / b;
        System.out.println("Division result: " + result);

        // --- Safe string handling ---
        String input = "Hello World";
        if (input != null) {
            System.out.println("Input length: " + input.length());
        } else {
            System.out.println("Input is null");
        }

        // --- Proper string comparison ---
        String userRole = "ADMIN";
        if ("ADMIN".equals(userRole)) {
            System.out.println("Admin access granted");
        }

        // --- Safe printUser logic inside main ---
        String user = "JohnDoe"; // Original parameter
        if (user != null) {
            System.out.println("User: " + user.toLowerCase());
        } else {
            System.out.println("User is null");
        }

        // --- Password check logic inside main ---
        String username = "admin";
        String password = "password123";
        boolean login = "admin".equals(username) && "password123".equals(password);
        if (login) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }

    }

}
